package id.ac.polbeng.gitafebiola.githubprofile.services
import id.ac.polbeng.gitafebiola.githubprofile.models.GithubUser
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
//import retrofit2.http.Header

interface GithubUserService {
    @GET("users/{login}")
    fun loginUser(
//        @Header("Authorization") token: String,
        @Path("login") userLogin: String
    ): Call<GithubUser>
}