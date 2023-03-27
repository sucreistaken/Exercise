public class Weapon {
  private int ammoCapacity;
  private int currentAmmo;
  private double reloadTime;
  private double firingRate;
  private String weaponName;
  private Ammunition ammunition;

  public Ammunition getAmmunition() {
    return ammunition;
  }

  public void setAmmunition(Ammunition ammunition) {
    this.ammunition = ammunition;
  }

  public Weapon(int ammoCapacity, int currentAmmo, double reloadTime, double firingRate, String weaponName, Ammunition ammunition) {
    this.ammoCapacity = ammoCapacity;
    this.currentAmmo = currentAmmo;
    this.reloadTime = reloadTime;
    this.firingRate = firingRate;
    this.weaponName = weaponName;
    this.ammunition= ammunition;
  }

  public int getAmmoCapacity() {
    return ammoCapacity;
  }

  public void setAmmoCapacity(int ammoCapacity) {
    this.ammoCapacity = ammoCapacity;
  }

  public double getCurrentAmmo() {
    return currentAmmo;
  }

  public void setCurrentAmmo(int currentAmmo) {
    this.currentAmmo = currentAmmo;
  }

  public double getReloadTime() {
    return reloadTime;
  }

  public void setReloadTime(int reloadTime) {
    this.reloadTime = reloadTime;
  }

  public double getFiringRate() {
    return firingRate;
  }

  public void setFiringRate(double firingRate) {
    this.firingRate = firingRate;
  }

  public String getWeaponName() {
    return weaponName;
  }
  public void setWeaponName(String weaponName) {
    this.weaponName = weaponName;
  }
  public boolean hasAmmo(){
    return currentAmmo>0;
  }
  public int fire(){
    if(!hasAmmo()){
      return 0;
    }
    currentAmmo--;
    return getAmmunition().getDamage();
  }
}
