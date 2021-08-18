import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.io.Serializable
import java.sql.Date

@Table("USERS")
data class User (
        @Id val id: String?,
        val title: String,
        val firstName: String,
        val lastName: String,
        val email: String,
        val picture: String,
        val dateOfBirth: Date?,
        val gender: String?,
        val phone: String?
) : Serializable