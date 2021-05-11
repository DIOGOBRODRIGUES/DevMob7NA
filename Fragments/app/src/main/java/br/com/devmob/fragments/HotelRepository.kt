package br.com.devmob.fragments

interface HotelRepository {
    fun save(hotel: Hotel)
    fun remove(vararg hotels: Hotel)
    fun hotelById(id: Long, callback: (Hotel?) ->Unit)
    fun search(term: String, callbacK: (List<Hotel>) ->Unit)
}