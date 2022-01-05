package com.example.mystarter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

//TODO Kotlin keywords

//Kotlin Hard Keywords
//Following is a list of hard keywords and they cannot be used as identifiers
/*
as	        as?	        break	        class
continue	do	        else	        false
for	        fun	        if	            in
!in	        interface	is	            !is
null	    object	    package	        return
super	    this	    throw	        true
try	        typealias	typeof	        val
var	        when	    while
*/
//Kotlin Soft Keywords
//Following is the list of keywords (soft) in the context when they are applicable and can be used as identifiers in other contexts
/*
by	        catch	    constructor	    delegate
dynamic	    field	    file	        finally
get	        import	    init	        param
property	receiver	set	            setparam
value	    where
*/