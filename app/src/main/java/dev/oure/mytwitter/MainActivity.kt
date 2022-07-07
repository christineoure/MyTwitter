package dev.oure.mytwitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.oure.mytwitter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTweets()


    }
    fun displayTweets(){
        var twitter = Twitter("KasmyKas", "kasmy2@gmail.com", "45", "34", "56", "49", "", "Chill with us @5PM", "kaskazini")
        var twitter1 = Twitter("KasmyKas", "kasmy2@gmail.com", "45", "34", "56", "49", "", "Chill with us @5PM", "kaskazini")
        var twitter2 = Twitter("KasmyKas", "kasmy2@gmail.com", "45", "34", "56", "49", "", "Chill with us @5PM", "kaskazini")
        var twitter3 = Twitter("KasmyKas", "kasmy2@gmail.com", "45", "34", "56", "49", "", "Chill with us @5PM", "kaskazini")
        var twitter4 = Twitter("KasmyKas", "kasmy2@gmail.com", "45", "34", "56", "49", "", "Chill with us @5PM", "kaskazini")
        var twitter5 = Twitter("KasmyKas", "kasmy2@gmail.com", "45", "34", "56", "49", "", "Chill with us @5PM", "kaskazini")
        var twitter6 = Twitter("KasmyKas", "kasmy2@gmail.com", "45", "34", "56", "49", "", "Chill with us @5PM", "kaskazini")
        var twitter7 = Twitter("KasmyKas", "kasmy2@gmail.com", "45", "34", "56", "49", "", "Chill with us @5PM", "kaskazini")
        var twitter8 = Twitter("KasmyKas", "kasmy2@gmail.com", "45", "34", "56", "49", "", "Chill with us @5PM", "kaskazini")
        var twitter9 = Twitter("KasmyKas", "kasmy2@gmail.com", "45", "34", "56", "49", "", "Chill with us @5PM", "kaskazini")
        var twitter10 = Twitter("KasmyKas", "kasmy2@gmail.com", "45", "34", "56", "49", "", "Chill with us @5PM", "kaskazini")
        var twitter11 = Twitter("KasmyKas", "kasmy2@gmail.com", "45", "34", "56", "49", "", "Chill with us @5PM", "kaskazini")
        var twitter12 = Twitter("KasmyKas", "kasmy2@gmail.com", "45", "34", "56", "49", "", "Chill with us @5PM", "kaskazini")

        var twitterList = listOf(twitter,twitter1,twitter2,twitter3,twitter4,twitter5,twitter6,twitter7,twitter8,twitter9,twitter10,twitter11,twitter12)
        var twitterAdapter = TwitterRvAdapter(twitterList)

        binding.rvTweet.layoutManager = LinearLayoutManager(this)
        binding.rvTweet.adapter = twitterAdapter
    }
}