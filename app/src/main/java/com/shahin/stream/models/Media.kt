package com.shahin.stream.models

import android.net.Uri
import androidx.annotation.Keep

@Keep
data class Media(
    val uri: Uri,
    val id: String?,
    val tag: Any?
)