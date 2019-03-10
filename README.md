Android - Font Awesome Icon
===================
Android library to use the [Font Awesome](https://fontawesome.com/icons) Icon collection in your android apps. This library is based on latest font awesome library **5.7.2**

![Download](https://api.bintray.com/packages/androidhive-info/maven/fontawesome/images/download.svg)

![Demo](https://user-images.githubusercontent.com/497670/29021175-41e613c4-7b82-11e7-8887-a6d8186aeca3.gif)

How to Use
-------------
1. Include the barcode reader dependency in app's **build.gradle**
```gradle
dependencies {
    // google mobile vision
    implementation 'com.google.android.gms:play-services-vision:11.0.2'

    // font awesome library
    implementation 'info.androidhive:fontawesome:0.0.4'
}
```
FontTextView
----
```xml
<fragment
        android:id="@+id/barcode_fragment"
        android:name="info.androidhive.barcode.BarcodeReader"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:auto_focus="true"
        app:use_flash="false" />
```

FontDrawable
----
```java
@Override
    public void onScanned(final Barcode barcode) {
        Log.e(TAG, "onScanned: " + barcode.displayValue);
        barcodeReader.playBeep();
        });
    }
```

Regular Icons
----

Solid Icons
----

Brand Icons
----
