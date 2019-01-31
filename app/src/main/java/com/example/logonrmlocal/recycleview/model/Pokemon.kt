package com.example.logonrmlocal.recycleview.model

import com.google.gson.annotations.SerializedName

data class Pokemon (
       @SerializedName("number") val numero: String,
       @SerializedName("name") val nome: String,
       @SerializedName("imageURL") val imagem: String
)