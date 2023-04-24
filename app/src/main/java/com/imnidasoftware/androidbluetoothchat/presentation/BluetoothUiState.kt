package com.imnidasoftware.androidbluetoothchat.presentation

import com.imnidasoftware.androidbluetoothchat.domain.chat.BluetoothDevice

data class BluetoothUiState(
    val scannedDevices: List<BluetoothDevice> = emptyList(),
    val pairedDevices: List<BluetoothDevice> = emptyList(),
)
