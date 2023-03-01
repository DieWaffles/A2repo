package edu.usna.mobileos.a2_braemerandrew

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.EditText
import android.widget.Button
import android.view.View
import android.webkit.WebViewClient
import androidx.core.content.ContextCompat.startActivity


class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var editText: EditText
    lateinit var webView: WebView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById(R.id.editURL)
        webView = findViewById(R.id.webView)
        //var myWebViewClient = WebViewClient()
        val goBut: Button = findViewById(R.id.goBut)
        goBut.setOnClickListener(this)
        val forBut: Button = findViewById(R.id.forBut)
        forBut.setOnClickListener(this)
        val backBut: Button = findViewById(R.id.backBut)
        backBut.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var x: Button? = v as Button
        var action: String? = x?.getText().toString()
        var url: String = editText.toString()
        when (action) {
            //Display webpage in the webview wedget as well as url
            "GO" -> webView.loadUrl(url)
            "forward" -> webView.loadUrl(url)
            "back" -> webView.loadUrl(url)
            "☆" -> webView.loadUrl(url)
            else -> {

            }
        }
    }
}
