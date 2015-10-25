WebView Demo Android Application
======================================

A simple Android application that allows you to load a URL in a WebView.

The WebView listens to two [JoskeyJS](https://github.com/tcoulter/jockeyjs) events:

* `userCreated` Event: Logs the phone number and user token
* `userReady` Event: Closes the WebView

## Code

Most of the logic is in the files `MainActivity.java` and `WebViewActivity.java`
The layout of the two activities are found in `activity_main.xml` and `activity_webview.xml` respectively.

## Installation

1. Configure the Android SDK in Eclipse as described [here](http://developer.android.com/sdk/index.html).
2. Clone the repo.
3. Open Eclipse and import the project.
4. Run the application on your device or on an emulator as described [here](http://developer.android.com/training/basics/firstapp/running-app.html).

