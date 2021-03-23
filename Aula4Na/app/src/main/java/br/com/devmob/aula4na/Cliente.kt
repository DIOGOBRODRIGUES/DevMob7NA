package br.com.devmob.aula4na

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Cliente (var codigo: Int, var nome: String):Parcelable{
}