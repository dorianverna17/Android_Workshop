package ro.pub.acs.android1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var myImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myImage = findViewById(R.id.my_image)

        val myButton: Button = findViewById(R.id.my_button)
        myButton.setOnClickListener { clickButton() }
    }

    private fun clickButton() {
//        val rand = (1..6).random()
//
//        Toast.makeText(this, "Am generat numarul " + rand, Toast.LENGTH_LONG).show()
//
//        val myTv: TextView = findViewById(R.id.my_tv)
//        myTv.text = rand.toString()

        val rand = (1..6).random()

        Toast.makeText(this, "Am generat numarul " + rand, Toast.LENGTH_LONG).show()

        val drawable = when (rand) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        myImage.setImageResource(drawable)
    }
}