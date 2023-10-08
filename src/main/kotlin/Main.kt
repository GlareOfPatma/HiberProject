import data.Account
import data.Person
import org.hibernate.Session
import org.hibernate.SessionFactory
import org.hibernate.Transaction
import java.math.BigInteger

fun main(args: Array<String>) {
    val acc1: Account = Account()
    acc1.accountNumber = "1111"
//    acc1.personid = 1
    val acc2: Account = Account()
    acc2.accountNumber = "2222"
//    acc1.personid = 1
    val pers1: Person = Person()
    pers1.id = 1
    pers1.surname = "abcha"
    pers1.age = 2
    pers1.debt = BigInteger("15555")
    pers1.isDriverLicense = true
    pers1.name = "23"
    pers1.secondName = "23"
    pers1.accounts = listOf<Account>(acc1, acc2)

    val factory: SessionFactory = SessionFactoryMaker.getFactory()
    try{
        val session: Session = factory.openSession()
        val tx: Transaction = session.beginTransaction()
        session.save(pers1)
        tx.commit()
    } catch (ex: Exception){
        ex.printStackTrace()
    }
}