package com.example.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id : Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title : String = "",
    @ColumnInfo(name= "wish-desc")
    val description : String = ""
    )

object DummyData{
    val wishlist = listOf(
        Wish(title = "GOOD ATTIRE", description = "to look smexy in the public and at my college"),
        Wish(title = "Samsung S24 Ultra", description = "its a damn good phone"),
        Wish(title = "Gaming Laptop", description = "who dont want ot have a gaming laptop"),
        Wish(title = "Watch", description = "A good watch to show my status")

    )

}
