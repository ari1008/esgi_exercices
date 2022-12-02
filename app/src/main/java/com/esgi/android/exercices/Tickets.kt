package com.esgi.android.exercices

import android.graphics.Typeface
import android.os.Bundle
import android.text.SpannableString
import android.text.style.StyleSpan
import android.widget.TextView
import java.util.*

/*class Tickets AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_product)


        val bookingList = Booking(
            name = "Test",
            streetAddress = "30 rue des Etat généraux",
            status = BookingStatus.COMPLETED,
            arrivalDate = Date(),
            exitDate = Date(),
        )
    }

    private fun setBookingInformations(booking: Booking) {
        findViewById<TextView>(R.id.name).applyBoldText(booking.name, R.string.parking)
        findViewById<TextView>(R.id.streetAddress).applyBoldText(booking.streetAddress, R.string.parking)
        findViewById<TextView>(R.id.status).applyBoldText(booking.status, R.string.status_completed)
        findViewById<TextView>(R.id.arrivalDate).applyBoldText(booking.arrivalDate, R.string.arrivalDate)
        findViewById<TextView>(R.id.exitDate).applyBoldText(booking.exitDate, R.string.exitDate)

    }

    private fun TextView.applyBoldText(text: String, idString: Int) {
        val string = getString(idString, text.ifEmpty { "Ø" })
        val spannable = SpannableString(string)
        if (string.indexOf(":") != -1) {
            spannable.setSpan(StyleSpan(Typeface.BOLD), 0, string.indexOf(":") + 1, 0)
        }
        this.text = spannable
    }


}*/