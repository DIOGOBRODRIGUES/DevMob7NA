package br.com.devmob.fragments

interface HotelListView {
    fun showHotels(hotels: List<Hotel>)
    fun showDetails(hotel: Hotel)
}