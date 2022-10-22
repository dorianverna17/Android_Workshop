package oop

class MusicPlayer {
    private var songs: Array<String> = arrayOf()
    //your code goes here

    fun add(song: String) {
        songs += song
    }

    fun show() {
        for (i in songs) {
            println(i)
        }
    }

    fun play() {
        println("Playing " + songs[0])
    }
}
fun main(args: Array<String>) {
    val m = MusicPlayer()

    while(true) {
        var input = readLine()!!
        if(input == "stop") {
            break
        }
        m.add(input)
    }
    m.show()
    m.play()
}