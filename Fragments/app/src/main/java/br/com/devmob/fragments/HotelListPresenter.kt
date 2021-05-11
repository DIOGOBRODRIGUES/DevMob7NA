package br.com.devmob.fragments

class HotelListPresenter(
    private val view: HotelListView,
    private val repository: HotelRepository
) {

    fun searchHotels(term: String){
        repository.search(term){
            hotels -> view.showHotels(hotels)
        }
    }

    fun showHotelDetail(hotel: Hotel){
        view.showDetails(hotel)
    }

}