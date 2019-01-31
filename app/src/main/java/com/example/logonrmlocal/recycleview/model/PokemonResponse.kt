package com.example.logonrmlocal.recycleview.model

import com.google.gson.annotations.SerializedName

data class PokemonResponse (@SerializedName("content") val pokemons: List<Pokemon>)