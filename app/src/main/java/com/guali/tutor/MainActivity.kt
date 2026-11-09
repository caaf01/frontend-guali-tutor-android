package com.guali.tutor

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var tvTituloLeccion: TextView
    private lateinit var tvDescripcionLeccion: TextView
    private lateinit var etEditorCodigo: EditText
    private lateinit var btnCompilar: Button
    private lateinit var btnEjecutar: Button
    private lateinit var tvConsola: TextView

    // Botones del menú superior
    private lateinit var btnLecciones: Button
    private lateinit var btnConfiguracion: Button
    private lateinit var btnHistorial: Button
    private lateinit var btnAyuda: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Vincular componentes visuales del XML
        tvTituloLeccion = findViewById(R.id.tvTituloLeccion)
        tvDescripcionLeccion = findViewById(R.id.tvDescripcionLeccion)
        etEditorCodigo = findViewById(R.id.etEditorCodigo)
        btnCompilar = findViewById(R.id.btnCompilar)
        btnEjecutar = findViewById(R.id.btnEjecutar)
        tvConsola = findViewById(R.id.tvConsola)

        btnLecciones = findViewById(R.id.btnLecciones)
        btnConfiguracion = findViewById(R.id.btnConfiguracion)
        btnHistorial = findViewById(R.id.btnHistorial)
        btnAyuda = findViewById(R.id.btnAyuda)

        // 2. Acciones del Menú Superior
        btnLecciones.setOnClickListener {
            Toast.makeText(this, "Navegando a Lecciones...", Toast.LENGTH_SHORT).show()
        }
        btnConfiguracion.setOnClickListener {
            Toast.makeText(this, "Navegando a Configuración...", Toast.LENGTH_SHORT).show()
        }
        btnHistorial.setOnClickListener {
            Toast.makeText(this, "Navegando a Historial...", Toast.LENGTH_SHORT).show()
        }
        btnAyuda.setOnClickListener {
            Toast.makeText(this, "Navegando a Ayuda...", Toast.LENGTH_SHORT).show()
        }

        // 3. Lógica del Botón COMPILAR
        btnCompilar.setOnClickListener {
            val codigo = etEditorCodigo.text.toString()

            if (codigo.contains("System.out.println")) {
                tvConsola.setTextColor(Color.parseColor("#2E7D32")) // Verde oscuro
                tvConsola.text = ">>> COMPILACIÓN EXITOSA (0 errores)\n[Programa listo para ser ejecutado]"
                btnEjecutar.isEnabled = true // Habilita Ejecutar al compilar con éxito
            } else {
                tvConsola.setTextColor(Color.RED)
                tvConsola.text = ">>> ERROR DE COMPILACIÓN:\nFalta instrucción System.out.println en el código."
                btnEjecutar.isEnabled = false // Deshabilita si falla
            }
        }

        // 4. Lógica del Botón EJECUTAR
        btnEjecutar.setOnClickListener {
            tvConsola.setTextColor(Color.parseColor("#0288D1")) // Azul
            tvConsola.text = ">>> EJECUTANDO PROGRAMA...\n------------------------------\nSalida:\nHola Mundo\n------------------------------\n[Proceso finalizado con código 0]"
        }
    }
}