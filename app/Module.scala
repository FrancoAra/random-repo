
import com.google.inject.AbstractModule
import services.{
  BatchImporter,
  MongoBatchImporter,
  Queries,
  MongoQueries,
  CountriesDictionary,
  MemCountriesDictionary
}

class Module extends AbstractModule {
  def configure() = {

    bind(classOf[BatchImporter])
      .to(classOf[MongoBatchImporter])
      .asEagerSingleton

    bind(classOf[Queries])
      .to(classOf[MongoQueries])

    bind(classOf[CountriesDictionary])
      .to(classOf[MemCountriesDictionary])
  }
}
