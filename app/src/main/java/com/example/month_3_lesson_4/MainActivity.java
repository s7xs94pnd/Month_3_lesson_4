package com.example.month_3_lesson_4;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnItemClick {

    private ArrayList<CL_gen> continentArr = new ArrayList<CL_gen>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);
        
        loadContinents();
        initRV();
    }

    private void initRV() {
        RecyclerView recyclerView = findViewById(R.id.rv_continents);
        continentsAdapter adapter =new continentsAdapter(getLayoutInflater(),continentArr,this);
        recyclerView.setAdapter(adapter);
    }

    private void loadContinents(){
// Африка
        ArrayList<Country> africaCountries = new ArrayList<>();

// Нигерия
        Country nigeria = new Country("Nigeria");
        nigeria.addCity("Lagos");
        nigeria.addCity("Abuja");
        nigeria.addCity("Ibadan");
        nigeria.addCity("Kano");
        nigeria.addCity("Port Harcourt");
        nigeria.addCity("Benin City");
        africaCountries.add(nigeria);

// Южная Африка
        Country southAfrica = new Country("South Africa");
        southAfrica.addCity("Cape Town");
        southAfrica.addCity("Johannesburg");
        southAfrica.addCity("Durban");
        southAfrica.addCity("Pretoria");
        southAfrica.addCity("Bloemfontein");
        southAfrica.addCity("Port Elizabeth");
        africaCountries.add(southAfrica);

// Египет
        Country egypt = new Country("Egypt");
        egypt.addCity("Cairo");
        egypt.addCity("Alexandria");
        egypt.addCity("Giza");
        egypt.addCity("Luxor");
        egypt.addCity("Aswan");
        egypt.addCity("Sharm El-Sheikh");
        africaCountries.add(egypt);

// Кения
        Country kenya = new Country("Kenya");
        kenya.addCity("Nairobi");
        kenya.addCity("Mombasa");
        kenya.addCity("Kisumu");
        kenya.addCity("Nakuru");
        kenya.addCity("Eldoret");
        kenya.addCity("Malindi");
        africaCountries.add(kenya);

// Марокко
        Country morocco = new Country("Morocco");
        morocco.addCity("Rabat");
        morocco.addCity("Casablanca");
        morocco.addCity("Marrakech");
        morocco.addCity("Fez");
        morocco.addCity("Tangier");
        morocco.addCity("Agadir");
        africaCountries.add(morocco);

// Эфиопия
        Country ethiopia = new Country("Ethiopia");
        ethiopia.addCity("Addis Ababa");
        ethiopia.addCity("Gondar");
        ethiopia.addCity("Mekelle");
        ethiopia.addCity("Bahir Dar");
        ethiopia.addCity("Hawassa");
        ethiopia.addCity("Dire Dawa");
        africaCountries.add(ethiopia);


        CL_gen africa = new CL_gen("Africa", africaCountries);
        continentArr.add(africa);


        // Южная Америка
        ArrayList<Country> southAmericaCountries = new ArrayList<>();

// Бразилия
        Country brazil = new Country("Brazil");
        brazil.addCity("São Paulo");
        brazil.addCity("Rio de Janeiro");
        brazil.addCity("Brasília");
        brazil.addCity("Salvador");
        brazil.addCity("Fortaleza");
        brazil.addCity("Belo Horizonte");
        southAmericaCountries.add(brazil);

// Аргентина
        Country argentina = new Country("Argentina");
        argentina.addCity("Buenos Aires");
        argentina.addCity("Córdoba");
        argentina.addCity("Rosario");
        argentina.addCity("Mendoza");
        argentina.addCity("La Plata");
        argentina.addCity("Mar del Plata");
        southAmericaCountries.add(argentina);

// Колумбия
        Country colombia = new Country("Colombia");
        colombia.addCity("Bogotá");
        colombia.addCity("Medellín");
        colombia.addCity("Cali");
        colombia.addCity("Barranquilla");
        colombia.addCity("Cartagena");
        colombia.addCity("Bucaramanga");
        southAmericaCountries.add(colombia);

// Перу
        Country peru = new Country("Peru");
        peru.addCity("Lima");
        peru.addCity("Cusco");
        peru.addCity("Arequipa");
        peru.addCity("Trujillo");
        peru.addCity("Chiclayo");
        peru.addCity("Iquitos");
        southAmericaCountries.add(peru);

// Чили
        Country chile = new Country("Chile");
        chile.addCity("Santiago");
        chile.addCity("Valparaíso");
        chile.addCity("Concepción");
        chile.addCity("La Serena");
        chile.addCity("Antofagasta");
        chile.addCity("Temuco");
        southAmericaCountries.add(chile);

// Уругвай
        Country uruguay = new Country("Uruguay");
        uruguay.addCity("Montevideo");
        uruguay.addCity("Salto");
        uruguay.addCity("Paysandú");
        uruguay.addCity("Las Piedras");
        uruguay.addCity("Rivera");
        uruguay.addCity("Maldonado");
        southAmericaCountries.add(uruguay);


        CL_gen southAmerica = new CL_gen("South America", southAmericaCountries);
        continentArr.add(southAmerica);



        // Северная Америка
        ArrayList<Country> northAmericaCountries = new ArrayList<>();

// США
        Country usa = new Country("USA");
        usa.addCity("New York");
        usa.addCity("Los Angeles");
        usa.addCity("Chicago");
        usa.addCity("Houston");
        usa.addCity("Phoenix");
        usa.addCity("Philadelphia");
        northAmericaCountries.add(usa);

// Канада
        Country canada = new Country("Canada");
        canada.addCity("Toronto");
        canada.addCity("Vancouver");
        canada.addCity("Montreal");
        canada.addCity("Calgary");
        canada.addCity("Ottawa");
        canada.addCity("Edmonton");
        northAmericaCountries.add(canada);

// Мексика
        Country mexico = new Country("Mexico");
        mexico.addCity("Mexico City");
        mexico.addCity("Guadalajara");
        mexico.addCity("Monterrey");
        mexico.addCity("Tijuana");
        mexico.addCity("Cancún");
        mexico.addCity("Puebla");
        northAmericaCountries.add(mexico);

// Куба
        Country cuba = new Country("Cuba");
        cuba.addCity("Havana");
        cuba.addCity("Santiago de Cuba");
        cuba.addCity("Holguín");
        cuba.addCity("Camagüey");
        cuba.addCity("Santa Clara");
        cuba.addCity("Cienfuegos");
        northAmericaCountries.add(cuba);

// Гватемала
        Country guatemala = new Country("Guatemala");
        guatemala.addCity("Guatemala City");
        guatemala.addCity("Mixco");
        guatemala.addCity("Villa Nueva");
        guatemala.addCity("Quetzaltenango");
        guatemala.addCity("Escuintla");
        guatemala.addCity("San Juan Sacatepéquez");
        northAmericaCountries.add(guatemala);

// Гаити
        Country haiti = new Country("Haiti");
        haiti.addCity("Port-au-Prince");
        haiti.addCity("Cap-Haïtien");
        haiti.addCity("Les Cayes");
        haiti.addCity("Gonaïves");
        haiti.addCity("Jacmel");
        haiti.addCity("Port-de-Paix");
        northAmericaCountries.add(haiti);


        CL_gen northAmerica = new CL_gen("North America", northAmericaCountries);
        continentArr.add(northAmerica);



        // Азия
        ArrayList<Country> asiaCountries = new ArrayList<>();

// Китай
        Country china = new Country("China");
        china.addCity("Beijing");
        china.addCity("Shanghai");
        china.addCity("Guangzhou");
        china.addCity("Shenzhen");
        china.addCity("Chengdu");
        china.addCity("Xi'an");
        asiaCountries.add(china);

// Индия
        Country india = new Country("India");
        india.addCity("New Delhi");
        india.addCity("Mumbai");
        india.addCity("Bangalore");
        india.addCity("Chennai");
        india.addCity("Kolkata");
        india.addCity("Hyderabad");
        asiaCountries.add(india);

// Япония
        Country japan = new Country("Japan");
        japan.addCity("Tokyo");
        japan.addCity("Osaka");
        japan.addCity("Kyoto");
        japan.addCity("Yokohama");
        japan.addCity("Nagoya");
        japan.addCity("Fukuoka");
        asiaCountries.add(japan);

// Южная Корея
        Country southKorea = new Country("South Korea");
        southKorea.addCity("Seoul");
        southKorea.addCity("Busan");
        southKorea.addCity("Incheon");
        southKorea.addCity("Daegu");
        southKorea.addCity("Daejeon");
        southKorea.addCity("Gwangju");
        asiaCountries.add(southKorea);

// Таиланд
        Country thailand = new Country("Thailand");
        thailand.addCity("Bangkok");
        thailand.addCity("Chiang Mai");
        thailand.addCity("Pattaya");
        thailand.addCity("Phuket");
        thailand.addCity("Hat Yai");
        thailand.addCity("Nakhon Ratchasima");
        asiaCountries.add(thailand);

// Индонезия
        Country indonesia = new Country("Indonesia");
        indonesia.addCity("Jakarta");
        indonesia.addCity("Surabaya");
        indonesia.addCity("Bandung");
        indonesia.addCity("Medan");
        indonesia.addCity("Semarang");
        indonesia.addCity("Palembang");
        asiaCountries.add(indonesia);


        CL_gen asia = new CL_gen("Asia", asiaCountries);
        continentArr.add(asia);

        // Европа
        ArrayList<Country> europeCountries = new ArrayList<>();

// Германия
        Country germany = new Country("Germany");
        germany.addCity("Berlin");
        germany.addCity("Munich");
        germany.addCity("Frankfurt");
        germany.addCity("Hamburg");
        germany.addCity("Cologne");
        germany.addCity("Stuttgart");
        europeCountries.add(germany);

// Франция
        Country france = new Country("France");
        france.addCity("Paris");
        france.addCity("Lyon");
        france.addCity("Marseille");
        france.addCity("Nice");
        france.addCity("Toulouse");
        france.addCity("Bordeaux");
        europeCountries.add(france);

// Великобритания
        Country uk = new Country("United Kingdom");
        uk.addCity("London");
        uk.addCity("Manchester");
        uk.addCity("Birmingham");
        uk.addCity("Liverpool");
        uk.addCity("Glasgow");
        uk.addCity("Edinburgh");
        europeCountries.add(uk);

// Италия
        Country italy = new Country("Italy");
        italy.addCity("Rome");
        italy.addCity("Milan");
        italy.addCity("Naples");
        italy.addCity("Turin");
        italy.addCity("Florence");
        italy.addCity("Venice");
        europeCountries.add(italy);

// Испания
        Country spain = new Country("Spain");
        spain.addCity("Madrid");
        spain.addCity("Barcelona");
        spain.addCity("Valencia");
        spain.addCity("Seville");
        spain.addCity("Bilbao");
        spain.addCity("Malaga");
        europeCountries.add(spain);

// Нидерланды
        Country netherlands = new Country("Netherlands");
        netherlands.addCity("Amsterdam");
        netherlands.addCity("Rotterdam");
        netherlands.addCity("The Hague");
        netherlands.addCity("Utrecht");
        netherlands.addCity("Eindhoven");
        netherlands.addCity("Groningen");
        europeCountries.add(netherlands);

        CL_gen europe = new CL_gen("Europe", europeCountries);
        continentArr.add(europe);



        // Австралия и Океания
        ArrayList<Country> australiaCountries = new ArrayList<>();

// Австралия
        Country australia = new Country("Australia");
        australia.addCity("Sydney");
        australia.addCity("Melbourne");
        australia.addCity("Brisbane");
        australia.addCity("Perth");
        australia.addCity("Adelaide");
        australia.addCity("Canberra");
        australiaCountries.add(australia);

// Новая Зеландия
        Country newZealand = new Country("New Zealand");
        newZealand.addCity("Auckland");
        newZealand.addCity("Wellington");
        newZealand.addCity("Christchurch");
        newZealand.addCity("Hamilton");
        newZealand.addCity("Tauranga");
        newZealand.addCity("Dunedin");
        australiaCountries.add(newZealand);

// Фиджи
        Country fiji = new Country("Fiji");
        fiji.addCity("Suva");
        fiji.addCity("Nadi");
        fiji.addCity("Lautoka");
        fiji.addCity("Labasa");
        fiji.addCity("Ba");
        fiji.addCity("Sigatoka");
        australiaCountries.add(fiji);

// Папуа-Новая Гвинея
        Country papuaNewGuinea = new Country("Papua New Guinea");
        papuaNewGuinea.addCity("Port Moresby");
        papuaNewGuinea.addCity("Lae");
        papuaNewGuinea.addCity("Madang");
        papuaNewGuinea.addCity("Mount Hagen");
        papuaNewGuinea.addCity("Wewak");
        papuaNewGuinea.addCity("Goroka");
        australiaCountries.add(papuaNewGuinea);

// Самоа
        Country samoa = new Country("Samoa");
        samoa.addCity("Apia");
        samoa.addCity("Vaitele");
        samoa.addCity("Faleasi'u");
        samoa.addCity("Vaiusu");
        samoa.addCity("Afega");
        samoa.addCity("Tafuna");
        australiaCountries.add(samoa);

// Тонга
        Country tonga = new Country("Tonga");
        tonga.addCity("Nuku'alofa");
        tonga.addCity("Neiafu");
        tonga.addCity("Mu'a");
        tonga.addCity("Haveluloto");
        tonga.addCity("Vaini");
        tonga.addCity("Kolonga");
        australiaCountries.add(tonga);


        CL_gen australiaContinent = new CL_gen("Australia", australiaCountries);
        continentArr.add(australiaContinent);
    }

    @Override
    public void onClick(int position) {
        CL_gen continent = continentArr.get(position);

        Intent intent = new Intent(this, container_Activity.class);
        intent.putExtra("data", continent);
        startActivity(intent);
    }
}