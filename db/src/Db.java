public class Db {

    private DbSetting dbSetting;
    private MyEntity myEntity;

    public Db(DbSetting dbSetting) {
        this.dbSetting = dbSetting;
    }

    public void setMyEntity(MyEntity myEntity) {
        this.myEntity = myEntity;
    }

    public DbSetting getDbSetting() {
        return dbSetting;
    }

    public String getMyEntity() {
        return myEntity.toString();
    }
}
