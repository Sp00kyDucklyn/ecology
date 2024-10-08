package com.cursokotlin.eco.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize
import java.util.Date

@Entity(tableName = "projects")
@Parcelize
data class Project (
    @PrimaryKey(autoGenerate = true)
    val id: Int  = 0,
    val projectTitle: String,
    val projectDesc: String

): Parcelable