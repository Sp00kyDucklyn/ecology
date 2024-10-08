package com.cursokotlin.eco.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "etiquetes",
    foreignKeys = [
        ForeignKey(
            entity = Picture::class,
            parentColumns = ["id"],
            childColumns = ["picturesId"],
            onDelete = ForeignKey.CASCADE
        )
    ])
@Parcelize
data class Etiquete (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val picturesId: Int,
    val etiquetenName: String

): Parcelable