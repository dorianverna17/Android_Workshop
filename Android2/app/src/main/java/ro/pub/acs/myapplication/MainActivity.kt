package ro.pub.acs.myapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import ro.pub.acs.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val myName: MyName = MyName("Dorian")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.myName = myName

//        findViewById<Button>(R.id.done_button).setOnClickListener { button ->
//            addNick(button)
//        }

        binding.doneButton.setOnClickListener { addNick(it) }

//        findViewById<TextView>(R.id.nickname_text).setOnClickListener {
//            changeNick(it)
//        }

        binding.nicknameText.setOnClickListener { changeNick(it) }
    }

    private fun addNick(view: View) {
//        val editText = findViewById<EditText>(R.id.nickname_edit)
//        val nickTextView = findViewById<TextView>(R.id.nickname_text)

////        val editText = binding.nicknameEdit
////        val nickTextView = binding.nicknameText

        lateinit var editText: EditText
        lateinit var nickTextView: TextView

        binding.apply {
            editText = nicknameEdit
            nickTextView = nicknameText
        }

//        nickTextView.text = editText.text

        binding.myName?.nickname = editText.text.toString()
        binding.invalidateAll()

        editText.visibility = View.GONE
        view.visibility = View.GONE
        nickTextView.visibility = View.VISIBLE

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }

    private fun changeNick(view: View) {
        val editText = findViewById<EditText>(R.id.nickname_edit)
        val button = findViewById<Button>(R.id.done_button)

        editText.visibility = View.VISIBLE
        button.visibility = View.VISIBLE
        view.visibility = View.GONE

        editText.requestFocus()

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(editText, 0)
    }
}