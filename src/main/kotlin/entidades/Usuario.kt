package entidades

data class Usuario(
    val nickname: String,
    val password: String,
    val nombre: String,
    val apellido: String,
    val dineroEnCuenta: Double,
    val fechaAlta: String

)