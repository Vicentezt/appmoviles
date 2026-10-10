package com.example.actividadguia233.model


data class UsuarioUiState(
    val correo: String = "",
    val nombre: String = "",
    val clave: String = "",
    val direccion: String = "",
    val aceptaTerminos: Boolean = false,
    val errores: UsuarioErrores = UsuarioErrores()
)