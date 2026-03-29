package com.illusionai.app.core

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit

class LanguageManager private constructor(context: Context) {
    private val prefs: SharedPreferences = context.getSharedPreferences("illusion_prefs", Context.MODE_PRIVATE)
        private val defaultLanguage = "en"
            
                fun getUserPreferredLanguage(): String {
                        return prefs.getString("preferred_language", defaultLanguage) ?: defaultLanguage
                            }
                                
                                    fun setUserPreferredLanguage(languageCode: String) {
                                            prefs.edit {
                                                        putString("preferred_language", languageCode)
                                                                }
                                                                    }
                                                                        
                                                                            fun getAvailableLanguages(): Map<String, String> {
                                                                                    return mapOf(
                                                                                                "en" to "English",
                                                                                                            "es" to "Español",
                                                                                                                        "fr" to "Français",
                                                                                                                                    "de" to "Deutsch",
                                                                                                                                                "it" to "Italiano",
                                                                                                                                                            "pt" to "Português",
                                                                                                                                                                        "ru" to "Русский",
                                                                                                                                                                                    "ja" to "日本語",
                                                                                                                                                                                                "ko" to "한국어",
                                                                                                                                                                                                            "zh" to "中文",
                                                                                                                                                                                                                        "ar" to "العربية",
                                                                                                                                                                                                                                    "hi" to "हिन्दी"
                                                                                                                                                                                                                                            )
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                                        companion object {
                                                                                                                                                                                                                                                                @Volatile
                                                                                                                                                                                                                                                                        private var INSTANCE: LanguageManager? = null
                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                        fun getInstance(context: Context): LanguageManager {
                                                                                                                                                                                                                                                                                                    return INSTANCE ?: synchronized(this) {
                                                                                                                                                                                                                                                                                                                    val instance = LanguageManager(context.applicationContext)
                                                                                                                                                                                                                                                                                                                                    INSTANCE = instance
                                                                                                                                                                                                                                                                                                                                                    instance
                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                            }