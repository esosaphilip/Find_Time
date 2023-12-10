package com.example.findtime.android

import android.annotation.SuppressLint
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshots.SnapshotStateList

// ktlint-disable filename

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainView(/**actionBarFun: topBarFun = { emptyComposable() }**/) {
    val showAddDialog = remember { mutableStateOf(false) }
    val currentTimezoneStrings = remember { SnapshotStateList<String>() }
    val selectedIndex = remember { mutableIntStateOf(0) }

    Scaffold(
        bottomBar = { BottomBar() },
        floatingActionButton = {
            FloatingActionButton(onClick = { showAddDialog.value = true }) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "add Time",
                )
            }
        },
        topBar = {
           // actionBarFun (selectedIndex.value)
        }

    ) {
    }
}
