package com.divyansh.navigator_learn

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient

class Fragment_One : Fragment(R.layout.fragment__one) {

    // this fragment is for google

    // setting up webview for google

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        // creating instance  for webview

        var web_g : WebView = view.findViewById(R.id.webgoogle)

        web_g.loadUrl("https://google.com")
        web_g.setWebViewClient(WebViewClient())

    }


}