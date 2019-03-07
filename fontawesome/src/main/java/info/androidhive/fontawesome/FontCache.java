package info.androidhive.fontawesome;

import android.content.Context;
import android.graphics.Typeface;

import java.util.Hashtable;

public class FontCache {
    public static final String FA_FONT_REGULAR = "fa-regular-400.ttf";
    public static final String FA_FONT_SOLID = "fa-solid-900.ttf";
    public static final String FA_FONT_BRANDS = "fa-brands-400.ttf";
    private static Hashtable<String, Typeface> fontCache = new Hashtable<>();

    public static Typeface get(Context context, String name) {
        Typeface typeface = fontCache.get(name);
        if (typeface == null) {
            try {
                typeface = Typeface.createFromAsset(context.getAssets(), name);
            } catch (Exception e) {
                return null;
            }
            fontCache.put(name, typeface);
        }
        return typeface;
    }
}
