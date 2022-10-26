package com.divyansh.navigator_learn

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient

class Fragment_two : Fragment(R.layout.fragment__two) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        //  creating instance  for web view

        var web_y : WebView = view.findViewById(R.id.yahoo)

        web_y.loadUrl("https://yahoo.com")
        web_y.setWebViewClient(WebViewClient())

    }

}