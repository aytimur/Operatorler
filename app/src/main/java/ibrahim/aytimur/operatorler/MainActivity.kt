package ibrahim.aytimur.operatorler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Aritmetik operatörler
        var a=23
        var b=3
        var topla=a + b
        var cikarma=a - b
        var carpim=a * b
        var bolme=a / b
        var mod=a % b
        textView.text=
            ("$topla" + "  " + "$cikarma" + "  " + "$carpim" + "  " + "$bolme" + "  " + "$mod")
        // Atama operatörleri
        var c=23
        var d=3
        //c += d
        c-=d
        textView.text=c.toString()
        // Tekli Operatörler
        var e = 3
        //e = -e
        //++e
        //--e
        //e = e++ +2
        e = ++e + 2
        textView.text = e.toString()
        // İlişkisel operatörler
        var x = 4
        var y = 5
        if (x != y){
            textView.text = "degerler farklı"
        }
        else{
            textView.text = "degerler aynı"
        }
        //Mantıksal operatörler
        var a1 = 10
        var b1 = 5
        var c1 = 15
        var durum = true
        if (a1>b1 || a1>c1){
            textView.text = (b1 + c1).toString() + !durum
        }
    }
}

