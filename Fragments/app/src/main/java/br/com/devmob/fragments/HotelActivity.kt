package br.com.devmob.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HotelActivity : AppCompatActivity(), HotelListFragment.OnHotelClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotel)
    }

    override fun onHotelClick(hotel: Hotel) {
        showDetailActivity(hotel.id)
    }

    private fun showDetailActivity (hotelId: Long){
        HotelDetailsActivity.open(this, hotelId)
    }
}