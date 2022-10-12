<?php
//1) creation de classe
class adherent
{
private $nom;
private $prenom;
private $numeroCarte;
private $DateAdherent;

// 2) get et set

public function __construct($unnom , $unprenom, $unnumeroCarte, $unDateAdherent)
{
$this->nom=$unnom;
$this->prenom=$unprenom;
$this->numeroCarte=$unnumeroCarte;
$this->DateAdherent=$unDateAdherent;
}
public function getnom()
 {
return $this->nom;
}
public function getprenom()
{
return $this->prenom;
}
public function getnumeroCarte()
{
return $this->numeroCarte;
}
public function getDateAdherent()
{
return $this->DateAdherent;
}

public function set_nom($unnom)
{
$this->nom=$unnom;
}
public function set_prenom($unprenom)
{
$this->prenom=$unprenom;
}
public function set_numeroCarte($unnumeroCarte)
{
$this->numeroCarte=$unnumeroCarte;
}
public function set_DateAdherent($unDateAdherent)
{
$this->DateAdherent=$unDateAdherent;
}
}
//creation d'adherent
$unobjet1 = new adherent ("Bliotek","Billy",10001,"10/9/2022");
$unobjet2 = new adherent ("Hugo","Victor",10002,NULL);

// creation Dictionnaire

$monDico=array();
$monDico["10001"]=$unobjet1;
$monDico["10002"]=$unobjet2;

// q5
echo " Le nom des adherent n'ayant pas de date d'adhesion";
foreach($monDico as $Lacle=>$unobjet)
{
   if($unobjet->getnumeroCarte()==0)
{
   echo $unobjet->getnom();
}
}
// q6

echo "<hr>";
if (isset($monDico["10003"]))
{
echo "Le numero de carte 10003 n'existe ";
}
else 
{
echo  "Le numero de carte 10003 n'existe pas";
}
?>
 































