package com.list_sample.korefarencesample

import android.content.Context
import jp.takuji31.koreference.KoreferenceModel
import jp.takuji31.koreference.intPreference
import jp.takuji31.koreference.stringPreference

/**
 * Created by monkey on 2017/11/07.
 */
class MyPreferences(context : Context) : KoreferenceModel(context = context, name = "my_preferences") {
    var name : String by stringPreference("noname")
    var age : Int by intPreference(17)
}