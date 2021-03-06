package vardansharma.me.picscrambler.data

import io.reactivex.Observable
import retrofit2.http.GET


interface FlickerService {
    @get:GET("/services/feeds/photos_public.gne?format=json&lang=en-us&nojsoncallback=1")
    val photos: Observable<PhotoWrapper>
}