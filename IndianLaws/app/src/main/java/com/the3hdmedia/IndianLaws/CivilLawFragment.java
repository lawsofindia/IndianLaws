package com.the3hdmedia.IndianLaws;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class CivilLawFragment extends Fragment {

    ArrayList<String> IPC =new ArrayList<String>();
    View v;
    public CivilLawFragment() {
        // Required empty public constructor


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_civil_law, container, false);
        ListView listView = v.findViewById(R.id.listview);

        IPC.add("1. Title and extent of operation of the Code");
        IPC.add("2. Punishment of offences committed within India");
        IPC.add("3. Punishment of offences committed beyond, but which by law may be tried within, India.");
        IPC.add("4. Extension of Code to extra-territorial offences.");
        IPC.add("5. Certain laws not to be affected by this Act");
        IPC.add("6. Definitions in the Code to be understood subject to exceptions.");
        IPC.add("7. Sense of expression once explained");
        IPC.add("8. Gender.");
        IPC.add("9. Number");
        IPC.add("10. “Man”. “Woman”");
        IPC.add("11. “Person”");
        IPC.add("12. “Public”");
        IPC.add("13. [Definition of “Queen”.]");
        IPC.add("14. “Servant of Government”.");
        IPC.add("15. [Definition of “British India”.] ");
        IPC.add("16. [Definition of “Government of India”.]");
        IPC.add("17 “Government”");
        IPC.add("18. “India”");
        IPC.add("19. “Judge”");
        IPC.add("20. “Court of Justice”");
        IPC.add("21. “Public servant”");
        IPC.add("22. “Movable property”.");
        IPC.add("23. “Wrongful gain”");
        IPC.add("24. “Dishonestly”");
        IPC.add("25. “Fraudulently”.");
        IPC.add("26. “Reason to believe”");
        IPC.add("27. “Property in possession of wife, clerk or servant”");
        IPC.add("28. “Counterfeit”");
        IPC.add("29. “Document”");
        IPC.add(" 30. “Valuable security”.");
        IPC.add("31. “A will”");
        IPC.add("32. Words referring to acts include illegal omissions.");
        IPC.add("33. “Act”. “Omission”.");
        IPC.add("34. Acts done by several persons in furtherance of common intention.");
        IPC.add("35. When such an act is criminal by reason of its being done with a criminal knowledge or intention.");
        IPC.add("36. Effect caused partly by act and partly by omission.");
        IPC.add("37. Co-operation by doing one of several acts constituting an offence.");
        IPC.add("38. Persons concerned in criminal act may be guilty of different offences");
        IPC.add("39. “Voluntarily”");
        IPC.add("40. “Offence”");
        IPC.add("41. “Special law”.");
        IPC.add("42. “Local law”.");
        IPC.add("43. “Illegal”. “Legally bound to do”.");
        IPC.add("44. “Injury”");
        IPC.add("45. “Life”.");
        IPC.add("46. “Death”.");
        IPC.add("47. “Animal”");
        IPC.add("48. “Vessel”");
        IPC.add("49. “Year”. “Month”.");
        IPC.add("50. “Section”");
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(v.getContext(),android.R.layout.simple_list_item_1,IPC);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                //Toast.makeText(v.getContext(),IPC.get(position),Toast.LENGTH_SHORT).show();
                AlertDialog.Builder alertBuilder = new AlertDialog.Builder(v.getContext());
                if(position == 0) {
                    alertBuilder.setMessage("This Act shall be called the Indian Penal Code, and shall extend to the whole of India except the State of Jammu and Kashmir.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if(position ==1)
                {
                    alertBuilder.setMessage("Every person shall be liable to punishment under this Code and not otherwise for every act or omission contrary to the provisions thereof, of which he shall be guilty within India ")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if(position ==2)
                {
                    alertBuilder.setMessage("Any person liable, by any Indian law, to be tried for an offence committed beyond India shall be dealt with according to the provisions of this Code for any act committed beyond India in the same manner as if such act had been committed within India.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if(position ==3)
                {
                    alertBuilder.setMessage("\"The provisions of this Code apply also to any offence committed by" +"\n" +
                            "10[(1) any citizen of India in any place without and beyond India;" +"\n" +
                            "(2) any person on any ship or aircraft registered in India wherever it may be." +"\n" +
                            "11[(3) any person in any place without and beyond India committing offence targeting a computer resource located in India.\n"+
                            "12[Explanation.—In this section—" +"\n" +
                            "(a) the word “offence” includes every act committed outside India which, if committed in" +"\n" +
                            "India, would be punishable under this Code;" +"\n" +
                            "(b) the expression “computer resource” shall have the meaning assigned to it in clause (k) of sub-section (1) of section 2 of the Information Technology Act, 2000 (21 of 2000);\n")
                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if(position ==4)
                {
                    alertBuilder.setMessage("Nothing in this Act shall affect the provisions of any Act for punishing mutiny and desertion of officers, soldiers, sailors or airmen in the service of the Government of India or the provisions of any special or local law.")
                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if(position ==5)
                {
                    alertBuilder.setMessage("Throughout this Code every definition of an offence, every penal provision, and every illustration of every such definition or penal provision, shall be understood subject to the exceptions contained in the Chapter entitled “General Exceptions”, though those exceptions are not repeated in such definition, penal provision, or illustration.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if(position ==6)
                {
                    alertBuilder.setMessage("Every expression which is explained in any part of this Code, is used in every part of this Code in conformity with the explanation.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if(position ==7)
                {
                    alertBuilder.setMessage("The pronoun “he” and its derivatives are used of any person, whether male or female.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if(position ==8)
                {
                    alertBuilder.setMessage("Unless the contrary appears from the context, words importing the singular number\n" +
                            "include the plural number, and words importing the plural number include the singular number.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if(position ==9)
                {
                    alertBuilder.setMessage("The word “man” denotes a male human being of any age; the word “woman” denotes a female human being of any age.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if(position ==10)
                {
                    alertBuilder.setMessage("The word “person” includes any Company or Association or body of persons, whether incorporated or not.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if(position ==11)
                {
                    alertBuilder.setMessage("The word “public” includes any class of the public or any community.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if(position ==12)
                {
                    alertBuilder.setMessage("Omitted by the A. O. 1950.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if(position ==13)
                {
                    alertBuilder.setMessage("The words “servant of Government” denote any officer or servant servant continued, appointed or employed in India by or under the authority of Government.]")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if(position ==14)
                {
                    alertBuilder.setMessage("Rep. by the A. O. 1937.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if(position ==15)
                {
                    alertBuilder.setMessage(" Rep., ibid.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if(position ==16)
                {
                    alertBuilder.setMessage("The word “Government” denotes the Central Government or the Government of a State.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if(position ==17)
                {
                    alertBuilder.setMessage("“India” means the territory of India excluding the State of Jammu and Kashmir")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if(position ==18)
                {
                    alertBuilder.setMessage("The word “Judge” denotes not only every person who is officially designated as a\n" +
                            "Judge, but also every person.\n" +
                            "who is empowered by law to give, in any legal proceeding, civil or criminal, a definitive judgment, or a judgment which, if not appealed against, would be definitive, or a judgment which, if confirmed by some other authority, would be definitive, or\n" +
                            "who is one of a body or persons, which body of persons is empowered by law to give such a judgment.")
                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if(position ==19)
                {
                   alertBuilder.setMessage("The words “Court of Justice” denote a Judge who is empowered by law to act judicially alone, or a body of Judges which is empowered by law to act judicially as a body, when such Judge or body of Judges is acting judicially.")
                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if(position ==20)
                {
                    alertBuilder.setMessage("The words “public servant” denote a person falling under any of the descriptions")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if(position ==21)
                {

                    alertBuilder.setMessage("The words “movable property” are intended to include corporeal property of every description, except land and things attached to the earth or permanently fastened to anything which is attached to the earth.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if(position ==22)
                {
                    alertBuilder.setMessage("“Wrongful gain” is gain by unlawful means of property to which the person gaining is not legally entitled.Wrongful loss”.\n“Wrongful loss” is the loss by unlawful means of property to which the person losing it is legally entitled.\n" +
                            "1. Subs. by the A.O. 1950, for “the Crown” which had been subs. by the A.O. 1937, for “Government”. 2. Certain words omitted by Act 40 of 1964, s. 2.\n" +
                            "3. Ins. by Act 39 of 1920, s. 2.\n" +
                            "4. Subs. by Act 40 of 1964, s. 2, for Cl. Twelfth.\n" +
                            "5. Explanation 4 omitted by Act 39 of 1920, s. 2.\n" +
                            " 18\n" +
                            "Gaining wrongfully/Losing wrongfully.—A person is said to gain wrongfully when such person retains wrongfully, as well as when such person acquires wrongfully. A person is said to lose wrongfully when such person is wrongfully kept out of any property, as well as when such person is wrongfully deprived of property.")
                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if(position ==23)
                {
                    alertBuilder.setMessage("Whoever does anything with the intention of causing wrongful gain to one person or wrongful loss to another person, is said to do that thing “dishonestly”.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if(position ==24)
                {
                    alertBuilder.setMessage("A person is said to do a thing fraudulently if he does that thing with intent to defraud but not otherwise.")
                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if(position ==25)
                {

                    alertBuilder.setMessage("A person is said to have “reason to believe” a thing, if he has sufficient cause to believe that thing but not otherwise.")
                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if(position ==26)
                {

                    alertBuilder.setMessage("When property is in the possession of a person's wife, clerk or servant, on account of that person, it is in that person's possession within the meaning of this Code.\n" +
                            "Explanation.—A person employed temporarily or on a particular occasion in the capacity of a clerk or servant, is a clerk or servant within the meaning of this section.")
                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if(position ==27)
                {

                    alertBuilder.setMessage("A person is said to “counterfeit” who causes one thing to resemble another thing, intending by means of that resemblance to practise deception, or knowing it to be likely that deception will thereby be practised.\n" +
                            "1[Explanation 1.—It is not essential to counterfeiting that the imitation should be exact.\n" +
                            "Explanation 2.—When a person causes one thing to resemble another thing, and the resemblance is such that a person might be deceived thereby, it shall be presumed, until the contrary is proved, that the person so causing the one thing to resemble the other thing intended by means of that resemblance to practise deception or knew it to be likely that deception would thereby be practised.]")
                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if(position ==28)
                {

                    alertBuilder.setMessage("The word “document” denotes any matter expressed or described upon any substance by means of letters, figures or marks, or by more than one of those means, intended to be used, or which may be used, as evidence of that matter.\n" +
                            "Explanation 1.—It is immaterial by what means or upon what substance the letters, figures or marks are formed, or whether the evidence is intended for, or may be used in, a Court of Justice, or not.\nExplanation 2.—Whatever is expressed by means of letters, figures or marks as explained by mercantile or other usage, shall be deemed to be expressed by such letters, figures or marks within the meaning of this section, although the same may not be actually expressed.")
                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if(position ==29)
                {
                    alertBuilder.setMessage("The words “valuable security” denote a document which is, or purports to be, a document whereby any legal right is created, extended, transferred, restricted, extinguished or released, or whereby any person acknowledges that he lies under legal liability, or has not a certain legal right.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if(position ==30)
                {
                    alertBuilder.setMessage("The words “a will” denote any testamentary document.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if(position ==31)
                {
                    alertBuilder.setMessage("In every part of this Code, except where a contrary intention appears from the context, words which refer to acts done extend also to illegal omissions.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if(position ==32)
                {
                    alertBuilder.setMessage("The word “act” denotes as well as series of acts as a single act: the word “omission” denotes as well a series of omissions as a single omission.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if(position ==33)
                {
                    alertBuilder.setMessage("When a criminal act is done by several persons in furtherance of the common intention of all, each of such persons is liable for that act in the same manner as if it were done by him alone.]")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if(position ==34)
                {
                    alertBuilder.setMessage("Whenever an act, which is criminal only by reason of its being done with a criminal knowledge or intention, is done by several persons, each of such persons who joins in the act with such knowledge or intention is liable for the act in the same manner as if the act were done by him alone with that knowledge or intention..")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if(position ==35)
                {
                    alertBuilder.setMessage("Wherever the causing of a certain effect, or an attempt to cause that effect, by an act or by an omission, is an offence, it is to be understood that the causing of that effect partly by an act and partly by an omission is the same offence")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if(position ==36)
                {
                    alertBuilder.setMessage("When an offence is committed by means of several acts, whoever intentionally co-operates in the commission of that offence by doing any one of those acts, either singly or jointly with any other person, commits that offence.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if(position ==37)
                {
                    alertBuilder.setMessage("Where several persons are engaged or concerned in the commission of a criminal act, they may be guilty of different offences by means of that act.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if(position ==38)
                {
                    alertBuilder.setMessage("A person is said to cause an effect “voluntarily” when he causes it by means whereby he intended to cause it, or by means which, at the time of employing those means, he knew or had reason to believe to be likely to cause it.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if(position ==39)
                {
                    alertBuilder.setMessage("Except in the 2[Chapters] and sections mentioned in clauses 2 and 3 of this section, the word “offence” denotes a thing made punishable by this Code.\n" +
                            "In Chapter IV, 3[Chapter VA] and in the following sections, namely, sections 4[64, 65, 66, 5[67], 71], 109, 110, 112, 114, 115, 116, 117,6[118, 119 and 120] 187, 194, 195, 203, 211, 213, 214, 221, 222, 223, 224, 225, 327, 328, 329, 330, 331, 347, 348, 388, 389 and 445, the word “offence” denotes a thing punishable under this Code, or under any special or local law as hereinafter defined.\n" +
                            "And in sections 141, 176, 177, 201, 202, 212, 216 and 441, the word “offence” has the same meaning when the thing punishable under the special or local law is punishable under such law with imprisonment for a term of six months or upwards, whether with or without fine.]")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if(position ==40)
                {
                    alertBuilder.setMessage("The word “Judge” denotes not only every person who is officially designated as a\n" +
                            "Judge, but also every person.\n" +
                            "who is empowered by law to give, in any legal proceeding, civil or criminal, a definitive judgment, or a judgment which, if not appealed against, would be definitive, or a judgment which, if confirmed by some other authority, would be definitive, or\n" +
                            "who is one of a body or persons, which body of persons is empowered by law to give such a judgment.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if(position ==41)
                {
                    alertBuilder.setMessage("The word “Judge” denotes not only every person who is officially designated as a\n" +
                            "Judge, but also every person.\n" +
                            "who is empowered by law to give, in any legal proceeding, civil or criminal, a definitive judgment, or a judgment which, if not appealed against, would be definitive, or a judgment which, if confirmed by some other authority, would be definitive, or\n" +
                            "who is one of a body or persons, which body of persons is empowered by law to give such a judgment.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if(position ==42)
                {
                    alertBuilder.setMessage("The word “Judge” denotes not only every person who is officially designated as a\n" +
                            "Judge, but also every person.\n" +
                            "who is empowered by law to give, in any legal proceeding, civil or criminal, a definitive judgment, or a judgment which, if not appealed against, would be definitive, or a judgment which, if confirmed by some other authority, would be definitive, or\n" +
                            "who is one of a body or persons, which body of persons is empowered by law to give such a judgment.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if(position ==43)
                {
                    alertBuilder.setMessage("The word “Judge” denotes not only every person who is officially designated as a\n" +
                            "Judge, but also every person.\n" +
                            "who is empowered by law to give, in any legal proceeding, civil or criminal, a definitive judgment, or a judgment which, if not appealed against, would be definitive, or a judgment which, if confirmed by some other authority, would be definitive, or\n" +
                            "who is one of a body or persons, which body of persons is empowered by law to give such a judgment.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if(position ==44)
                {
                    alertBuilder.setMessage("The word “Judge” denotes not only every person who is officially designated as a\n" +
                            "Judge, but also every person.\n" +
                            "who is empowered by law to give, in any legal proceeding, civil or criminal, a definitive judgment, or a judgment which, if not appealed against, would be definitive, or a judgment which, if confirmed by some other authority, would be definitive, or\n" +
                            "who is one of a body or persons, which body of persons is empowered by law to give such a judgment.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if(position ==45)
                {
                    alertBuilder.setMessage("The word “Judge” denotes not only every person who is officially designated as a\n" +
                            "Judge, but also every person.\n" +
                            "who is empowered by law to give, in any legal proceeding, civil or criminal, a definitive judgment, or a judgment which, if not appealed against, would be definitive, or a judgment which, if confirmed by some other authority, would be definitive, or\n" +
                            "who is one of a body or persons, which body of persons is empowered by law to give such a judgment.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if(position ==46)
                {
                    alertBuilder.setMessage("The word “Judge” denotes not only every person who is officially designated as a\n" +
                            "Judge, but also every person.\n" +
                            "who is empowered by law to give, in any legal proceeding, civil or criminal, a definitive judgment, or a judgment which, if not appealed against, would be definitive, or a judgment which, if confirmed by some other authority, would be definitive, or\n" +
                            "who is one of a body or persons, which body of persons is empowered by law to give such a judgment.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if(position ==47)
                {
                    alertBuilder.setMessage("The word “Judge” denotes not only every person who is officially designated as a\n" +
                            "Judge, but also every person.\n" +
                            "who is empowered by law to give, in any legal proceeding, civil or criminal, a definitive judgment, or a judgment which, if not appealed against, would be definitive, or a judgment which, if confirmed by some other authority, would be definitive, or\n" +
                            "who is one of a body or persons, which body of persons is empowered by law to give such a judgment.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if(position ==48)
                {
                    alertBuilder.setMessage("The word “Judge” denotes not only every person who is officially designated as a\n" +
                            "Judge, but also every person.\n" +
                            "who is empowered by law to give, in any legal proceeding, civil or criminal, a definitive judgment, or a judgment which, if not appealed against, would be definitive, or a judgment which, if confirmed by some other authority, would be definitive, or\n" +
                            "who is one of a body or persons, which body of persons is empowered by law to give such a judgment.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if(position ==49)
                {
                    alertBuilder.setMessage("The word “Judge” denotes not only every person who is officially designated as a\n" +
                            "Judge, but also every person.\n" +
                            "who is empowered by law to give, in any legal proceeding, civil or criminal, a definitive judgment, or a judgment which, if not appealed against, would be definitive, or a judgment which, if confirmed by some other authority, would be definitive, or\n" +
                            "who is one of a body or persons, which body of persons is empowered by law to give such a judgment.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if(position ==50)
                {
                    alertBuilder.setMessage("The word “Judge” denotes not only every person who is officially designated as a\n" +
                            "Judge, but also every person.\n" +
                            "who is empowered by law to give, in any legal proceeding, civil or criminal, a definitive judgment, or a judgment which, if not appealed against, would be definitive, or a judgment which, if confirmed by some other authority, would be definitive, or\n" +
                            "who is one of a body or persons, which body of persons is empowered by law to give such a judgment.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }




                AlertDialog alert = alertBuilder.create();
                alert.setTitle(IPC.get(position));
                alert.show();
            }

        });


        return v;
    }

}
