class YngsteForstReseptliste extends EnkelReseptliste{

    // denne må overskrive metoden i konstruktøren
    // for å sett inn objekt. Må sette inn foran


    public boolean settInnResept(Resept r){
        // hvis lista inneholder r fra før, ikke legg til på nytt
        if(inneholder(r)){
            return false; 
        }
        else if(tom()){
            // Hvis lista er tom, sett inn den nye noden på første plass
            forste = new Node(r);
            siste = forste;
            return true;
        }
        else{
            // Lista er ikke tom, sett inn den nye noden først.
            Node nyNode = new Node(r);
            nyNode.neste = forste;
            forste = nyNode;
            return true;
        }
    }

}




