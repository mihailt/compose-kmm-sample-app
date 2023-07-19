import androidx.compose.material.MaterialTheme
import org.jetbrains.skiko.wasm.onWasmReady

fun main() {
    onWasmReady {
        BrowserViewportWindow {
            MaterialTheme {
                SampleApp()
            }
        }
    }
}

