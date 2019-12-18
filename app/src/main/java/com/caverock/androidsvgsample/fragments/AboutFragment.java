package com.caverock.androidsvgsample.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.caverock.androidsvgsample.R;

/**
 * Demonstrates how to render an SVG to a Bitmap object user SVG.renderToCanvas().
 * <p>
 * For the SVG we are using the "Bouquet" emoji from the Google Noto Emoji font.
 * https://github.com/googlei18n/noto-emoji/blob/master/svg/emoji_u1f490.svg
 */
public class AboutFragment extends Fragment {
    private static final String TAG = AboutFragment.class.getSimpleName();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.content_about, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        final WebView webView = view.findViewById(R.id.about);
        webView.loadUrl("file:///android_asset/about.html");
    }

}
