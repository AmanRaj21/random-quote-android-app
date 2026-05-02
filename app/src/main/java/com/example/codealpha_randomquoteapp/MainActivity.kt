package com.example.codealpha_randomquoteapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private val quotes = listOf(
        "Believe in yourself." to "— Unknown",
        "The best way to get started is to quit talking and begin doing." to "— Walt Disney",
        "It always seems impossible until it’s done." to "— Nelson Mandela",
        "Don’t watch the clock; do what it does. Keep going." to "— Sam Levenson",
        "The future depends on what you do today." to "— Mahatma Gandhi"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val quoteText: TextView = findViewById(R.id.quoteText)
        val authorText: TextView = findViewById(R.id.authorText)
        val button: Button = findViewById(R.id.newQuoteButton)

        fun showRandomQuote() {
            val (quote, author) = quotes[Random.nextInt(quotes.size)]
            quoteText.text = quote
            authorText.text = author
        }

        showRandomQuote()

        button.setOnClickListener {
            showRandomQuote()
        }
    }
}
