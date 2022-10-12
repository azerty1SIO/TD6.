<?php

class LIVRE
{
   private $ISBN;
   private $Titre;
   private $Prix;
   private $Dispo;
   public function __construct($unISBN,$unTitre,$unPrix,$unDispo)
{
       $this->ISBN=$unISBN;
       $this->Titre=$unTitre;
       $this->Prix=$unPrix;
       $this->Dispo=$unDispo;
}
   public function get_ISBN()
{
       return  $this->ISBN;
} 
   public function get_Titre()
{
       return  $this->Titre;
}
   
   public function get_Prix()
{
       return  $this->Prix;
}

   public function get_Dispo()
{
       return  $this->Dispo;
}
   public function set_ISBN($unISBN)
{
               $this->ISBN=$unISBN;
}
   public function set_Titre($unTitre)
{
               $this->Titre=$unTitre;
}
   public function set_Prix($unPrix)
{
               $this->Prix=$unPrix;
}
   public function set_Dispo($unDispo)
{
               $this->Dispo=$unDispo;

}
}
 $l1= new LIVRE ("EEE032","programmer en C",10,0);
 $l2= new LIVRE ("JAV44","programmer en java",50,0);


$monDico = array();
$monDico["EEE032"] = $l1;

$monDico["JAV44"] = $l2;

$monDico ["EEE032"]-> set_Dispo(1);


$monDico ["EEE032"]->set_Dispo(1);
echo $monDico ["EEE032"]->get_Dispo();

foreach ($monDico as $lacle=>$unobjet)
{
if ($unobjet -> get_Dispo()==1){
echo $unobjet->get_Titre();}
}
foreach ($unobjet 


?>






            
 
