package com.example.a10customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val anime = arrayOf<String>("Naruto","One-Piece","Death-Note","Dragonball-Z","Jujutsu Kaisen"
    ,"HunterXHunter","Black Clover","One Punch Man","My Hero Academia" ,"Haikyuu")

    val description = arrayOf<String>(
        "Naruto is a Japanese manga series written and illustrated by Masashi Kishimoto. It tells the story of Naruto Uzumaki, a young ninja who seeks recognition from his peers and dreams of becoming the Hokage, the leader of his village.",
        "The series focuses on Monkey D. Luffy, a young man made of rubber, who, inspired by his childhood idol, the powerful pirate Red-Haired Shanks, sets off on a journey from the East Blue Sea to find the mythical treasure, the One Piece, and proclaim himself the King of the Pirates.",
        "A high school student named Light Turner discovers a mysterious notebook that has the power to kill anyone whose name is written within its pages, and launches a secret crusade to rid the world of criminals.",
        "Dragon Ball Z follows the adventures of the adult Goku who, along with his companions, defends the earth against an assortment of villains ranging from intergalactic space fighters and conquerors, unnaturally powerful androids and near indestructible magical creatures.",
        "Yuji Itadori, a kind-hearted teenager, joins his school's Occult Club for fun, but discovers that its members are actual sorcerers who can manipulate the energy between beings for their own use. He hears about a cursed talisman - the finger of Sukuna, a demon - and its being targeted by other cursed beings.",
        "The story focuses on a young boy named Gon Freecss who discovers that his father, who left him at a young age, is actually a world-renowned Hunter, a licensed professional who specializes in fantastical pursuits such as locating rare or unidentified animal species, treasure hunting, surveying unexplored enclaves",
        "The series focuses on Asta, a young orphan who is left to be raised in an orphanage alongside his fellow orphan, Yuno. While everyone is born with the ability to utilize mana in the form of magical power, Asta, with no magic instead focuses on physical strength.",
        "One-Punch Man is a Japanese superhero manga series created by One. It tells the story of Saitama, a superhero who, because he can defeat any opponent with a single punch, grows bored from a lack of challenge.",
        "Academies across the globe train their students to learn to fight crime with their powers. Izuku Midoriya, a boy born without any powers, dreams of being able to become a super hero too, but gets bullied for his unrealistic dreams. One day, his fate changes in an unexpected meeting with the no.",
        "Haikyu!! (ハイキュー!!, Haikyū!!, from the kanji 排球 volleyball) is a Japanese manga series written and illustrated by Haruichi Furudate. It was serialized in Shueisha's shōnen manga magazine Weekly Shōnen Jump from February 2012 to July 2020, with its chapters collected in 45 tankōbon volumes."
        )
    val imageId = arrayOf<Int>(
        R.drawable.naruto1 , R.drawable.onepiece , R.drawable.deathnote , R.drawable.dragonballz ,
        R.drawable.jujutsukaisen , R.drawable.hunter , R.drawable.blackclover ,
        R.drawable.onepunchman , R.drawable.myheroacademia , R.drawable.haikyu
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.ListView)

        val myListAdapter = MyListAdapter(this,anime,description,imageId)
        listView.adapter = myListAdapter

        listView.setOnItemClickListener(){adapterView,view,position,id ->

            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
            Toast.makeText(this,"Click on item at $itemAtPos its item id is : $itemIdAtPos",Toast.LENGTH_LONG).show()

        }
    }


}




