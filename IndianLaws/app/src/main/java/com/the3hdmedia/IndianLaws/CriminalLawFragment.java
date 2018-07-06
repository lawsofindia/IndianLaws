package com.the3hdmedia.IndianLaws;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class CriminalLawFragment extends Fragment {

    public CriminalLawFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View v = inflater.inflate(R.layout.fragment_criminal_law, container, false);
        final ArrayList<String> criminalLaws = new ArrayList<String>();

        ListView listView = v.findViewById(R.id.listview_criminalLaw);

        criminalLaws.add("1. Title and extent of operation of the Code");
        criminalLaws.add("2. Punishment of offences committed within India");
        criminalLaws.add("3. Punishment of offences committed beyond, but which by law may be tried within, India.");
        criminalLaws.add("4. Extension of Code to extra-territorial offences.");
        criminalLaws.add("5. Certain laws not to be affected by this Act");
        criminalLaws.add("6. Definitions in the Code to be understood subject to exceptions.");
        criminalLaws.add("7. Sense of expression once explained");
        criminalLaws.add("8. Gender.");
        criminalLaws.add("9. Number");
        criminalLaws.add("10. “Man”. “Woman”");
        criminalLaws.add("11. “Person”");
        criminalLaws.add("12. “Public”");
        criminalLaws.add("13. [Definition of “Queen”.]");
        criminalLaws.add("14. “Servant of Government”.");
        criminalLaws.add("15. [Definition of “British India”.] ");
        criminalLaws.add("16. [Definition of “Government of India”.]");
        criminalLaws.add("17 “Government”");
        criminalLaws.add("18. “India”");
        criminalLaws.add("19. “Judge”");
        criminalLaws.add("20. “Court of Justice”");
        criminalLaws.add("21. “Public servant”");
        criminalLaws.add("22. “Movable property”.");
        criminalLaws.add("23. “Wrongful gain”");
        criminalLaws.add("24. “Dishonestly”");
        criminalLaws.add("25. “Fraudulently”.");
        criminalLaws.add("26. “Reason to believe”");
        criminalLaws.add("27. “Property in possession of wife, clerk or servant”");
        criminalLaws.add("28. “Counterfeit”");
        criminalLaws.add("29. “Document”");
        criminalLaws.add(" 30. “Valuable security”.");
        criminalLaws.add("31. “A will”");
        criminalLaws.add("32. Words referring to acts include illegal omissions.");
        criminalLaws.add("33. “Act”. “Omission”.");
        criminalLaws.add("34. Acts done by several persons in furtherance of common intention.");
        criminalLaws.add("35. When such an act is criminal by reason of its being done with a criminal knowledge or intention.");
        criminalLaws.add("36. Effect caused partly by act and partly by omission.");
        criminalLaws.add("37. Co-operation by doing one of several acts constituting an offence.");
        criminalLaws.add("38. Persons concerned in criminal act may be guilty of different offences");
        criminalLaws.add("39. “Voluntarily”");
        criminalLaws.add("40. “Offence”");
        criminalLaws.add("41. “Special law”.");
        criminalLaws.add("42. “Local law”.");
        criminalLaws.add("43. “Illegal”. “Legally bound to do”.");
        criminalLaws.add("44. “Injury”");
        criminalLaws.add("45. “Life”.");
        criminalLaws.add("46. “Death”.");
        criminalLaws.add("47. “Animal”");
        criminalLaws.add("48. “Vessel”");
        criminalLaws.add("49. “Year”. “Month”.");
        criminalLaws.add("50. “Section”");
        criminalLaws.add("51.“Oath”");
        criminalLaws.add("52. “Good faith”");
        criminalLaws.add("52A. “Harbour-“");
        criminalLaws.add("53. Punishments.");
        criminalLaws.add("53A. Construction of reference to transportation.");
        criminalLaws.add("54. Commutation of sentence of death.");
        criminalLaws.add("55. Commutation of sentence of imprisonment for life. ");
        criminalLaws.add("55A. Definition of appropriate Government");
        criminalLaws.add("56. [Repealed.]  ");
        criminalLaws.add("57. Fractions of terms of punishment.");
        criminalLaws.add("58. [Repealed.] ");
        criminalLaws.add("59. [Repealed.] ");
        criminalLaws.add("60. Sentence may be (in certain cases of imprisonment) wholly or partly rigorous of simple.");
        criminalLaws.add("61. [Repealed.] ");
        criminalLaws.add("62. [Repealed.] ");
        criminalLaws.add("63. Amount of fine.");
        criminalLaws.add("64. Sentence of imprisonment for non-payment of fine.");
        criminalLaws.add("65. Limit to imprisonment for non-payment of fine, when imprisonment and fine awardable.");
        criminalLaws.add(" 66. Description of imprisonment for non-payment of fine.");
        criminalLaws.add("67. Imprisonment for non-payment of fine, when offence punishable with fine only. ");
        criminalLaws.add("68. Imprisonment to terminate on payment of fine. ");
        criminalLaws.add("69. Termination of imprisonment on payment of proportional part of fine.");
        criminalLaws.add("70. Fine leviable within six years, of during imprisonment. Death not to discharge property from liability. ");
        criminalLaws.add("71. Limit of punishment of offence made up of several offences. ");
        criminalLaws.add("72. Punishment of person guilty of one of several offences, the judgment stating that is doubtful of which. 73. Solitary confinement. 74. Limit of solitary confinement. ");
        criminalLaws.add("73. Solitary confinement. 74. Limit of solitary confinement. ");
        criminalLaws.add("74. Limit of solitary confinement.");
        criminalLaws.add("75. Enhanced punishment for certain offences under Chapter XII or Chapter XVII after previous conviction.");
        criminalLaws.add("76. Act done by a person bound, or by mistake of fact believing himself bound, by law.");
        criminalLaws.add("77. Act of Judge when acting judicially.");
        criminalLaws.add("78. Act done pursuant to the judgment or order of Court.");
        criminalLaws.add("79. Act done by a person justified, or by mistake of fact believing himself justified, by law.");
        criminalLaws.add("80. Accident in doing a lawful act.");
        criminalLaws.add("81. Act likely to cause harm, but done without criminal intent, and to prevent other harm.");
        criminalLaws.add("82. Act of a child under seven years of age.");
        criminalLaws.add("83. Act of a child above seven and under twelve of immature understanding.");
        criminalLaws.add("84. Act of a person of unsound mind.");
        criminalLaws.add("85. Act of a person incapable of judgment by reason of intoxication caused against his will.");
        criminalLaws.add("86. Offence requiring a particular intent or knowledge committed by one who is intoxicated.");
        criminalLaws.add("87. Act not intended and not known to be likely to cause death or grievous hurt, done by consent.");
        criminalLaws.add("88. Act not intended to cause death, done by consent in good faith for person's benefit.");
        criminalLaws.add("89. Act done in good faith for benefit of child or insane person, by or by consent of guardian."+" Provisos." );
        criminalLaws.add("90. Consent known to be given under fear or misconception."+"\nConsent of insane person."+"\nConsent of child.");
        criminalLaws.add("91. Exclusion of acts which are offences independently of harm caused.");
        criminalLaws.add("92. Act done in good faith for benefit of a person without consent.");
        criminalLaws.add("93. Communication made in good faith.");
        criminalLaws.add("94. Act to which a person is compelled by threats.");
         criminalLaws.add("95. Act causing slight harm.");
        criminalLaws.add(" 96. Things done in private defence.");
        criminalLaws.add("97. Right of private defence of the body and of property.");
        criminalLaws.add("98. Right of private defence against the act of a person of unsound mind. etc.");
        criminalLaws.add(" 99. Acts against which there is no right of private defence.\n\t Extent to which the right may be exercised.");
        criminalLaws.add(" 100.When the right of private defence of the body extends to causing death.");
        criminalLaws.add("");




        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(v.getContext(), android.R.layout.simple_list_item_1, criminalLaws);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                AlertDialog.Builder alertBuilder = new AlertDialog.Builder(v.getContext());
                if (position == 0) {
                    alertBuilder.setMessage("This Act shall be called the Indian Penal Code, and shall extend to the whole of India except the State of Jammu and Kashmir.")

                            .setCancelable(false)
                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if (position == 1) {
                    alertBuilder.setMessage("Every person shall be liable to punishment under this Code and not otherwise for every act or omission contrary to the provisions thereof, of which he shall be guilty within India ")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if (position == 2) {
                    alertBuilder.setMessage("Any person liable, by any Indian law, to be tried for an offence committed beyond India shall be dealt with according to the provisions of this Code for any act committed beyond India in the same manner as if such act had been committed within India.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if (position == 3) {
                    alertBuilder.setMessage("\"The provisions of this Code apply also to any offence committed by" + "\n" +
                            "10[(1) any citizen of India in any place without and beyond India;" + "\n" +
                            "(2) any person on any ship or aircraft registered in India wherever it may be." + "\n" +
                            "11[(3) any person in any place without and beyond India committing offence targeting a computer resource located in India.\n" +
                            "12[Explanation.—In this section—" + "\n" +
                            "(a) the word “offence” includes every act committed outside India which, if committed in" + "\n" +
                            "India, would be punishable under this Code;" + "\n" +
                            "(b) the expression “computer resource” shall have the meaning assigned to it in clause (k) of sub-section (1) of section 2 of the Information Technology Act, 2000 (21 of 2000);\n")
                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if (position == 4) {
                    alertBuilder.setMessage("Nothing in this Act shall affect the provisions of any Act for punishing mutiny and desertion of officers, soldiers, sailors or airmen in the service of the Government of India or the provisions of any special or local law.")
                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if (position == 5) {
                    alertBuilder.setMessage("Throughout this Code every definition of an offence, every penal provision, and every illustration of every such definition or penal provision, shall be understood subject to the exceptions contained in the Chapter entitled “General Exceptions”, though those exceptions are not repeated in such definition, penal provision, or illustration.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if (position == 6) {
                    alertBuilder.setMessage("Every expression which is explained in any part of this Code, is used in every part of this Code in conformity with the explanation.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if (position == 7) {
                    alertBuilder.setMessage("The pronoun “he” and its derivatives are used of any person, whether male or female.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if (position == 8) {
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
                if (position == 9) {
                    alertBuilder.setMessage("The word “man” denotes a male human being of any age; the word “woman” denotes a female human being of any age.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if (position == 10) {
                    alertBuilder.setMessage("The word “person” includes any Company or Association or body of persons, whether incorporated or not.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if (position == 11) {
                    alertBuilder.setMessage("The word “public” includes any class of the public or any community.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if (position == 12) {
                    alertBuilder.setMessage("Omitted by the A. O. 1950.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if (position == 13) {
                    alertBuilder.setMessage("The words “servant of Government” denote any officer or servant servant continued, appointed or employed in India by or under the authority of Government.]")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if (position == 14) {
                    alertBuilder.setMessage("Rep. by the A. O. 1937.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if (position == 15) {
                    alertBuilder.setMessage(" Rep., ibid.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if (position == 16) {
                    alertBuilder.setMessage("The word “Government” denotes the Central Government or the Government of a State.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if (position == 17) {
                    alertBuilder.setMessage("“India” means the territory of India excluding the State of Jammu and Kashmir")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if (position == 18) {
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
                if (position == 19) {
                    alertBuilder.setMessage("The words “Court of Justice” denote a Judge who is empowered by law to act judicially alone, or a body of Judges which is empowered by law to act judicially as a body, when such Judge or body of Judges is acting judicially.")
                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if (position == 20) {
                    alertBuilder.setMessage("The words “public servant” denote a person falling under any of the descriptions")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if (position == 21) {

                    alertBuilder.setMessage("The words “movable property” are intended to include corporeal property of every description, except land and things attached to the earth or permanently fastened to anything which is attached to the earth.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if (position == 22) {
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

                if (position == 23) {
                    alertBuilder.setMessage("Whoever does anything with the intention of causing wrongful gain to one person or wrongful loss to another person, is said to do that thing “dishonestly”.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if (position == 24) {
                    alertBuilder.setMessage("A person is said to do a thing fraudulently if he does that thing with intent to defraud but not otherwise.")
                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if (position == 25) {

                    alertBuilder.setMessage("A person is said to have “reason to believe” a thing, if he has sufficient cause to believe that thing but not otherwise.")
                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if (position == 26) {

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

                if (position == 27) {

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

                if (position == 28) {

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

                if (position == 29) {
                    alertBuilder.setMessage("The words “valuable security” denote a document which is, or purports to be, a document whereby any legal right is created, extended, transferred, restricted, extinguished or released, or whereby any person acknowledges that he lies under legal liability, or has not a certain legal right.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if (position == 30) {
                    alertBuilder.setMessage("The words “a will” denote any testamentary document.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if (position == 31) {
                    alertBuilder.setMessage("In every part of this Code, except where a contrary intention appears from the context, words which refer to acts done extend also to illegal omissions.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if (position == 32) {
                    alertBuilder.setMessage("The word “act” denotes as well as series of acts as a single act: the word “omission” denotes as well a series of omissions as a single omission.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if (position == 33) {
                    alertBuilder.setMessage("When a criminal act is done by several persons in furtherance of the common intention of all, each of such persons is liable for that act in the same manner as if it were done by him alone.]")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if (position == 34) {
                    alertBuilder.setMessage("Whenever an act, which is criminal only by reason of its being done with a criminal knowledge or intention, is done by several persons, each of such persons who joins in the act with such knowledge or intention is liable for the act in the same manner as if the act were done by him alone with that knowledge or intention..")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if (position == 35) {
                    alertBuilder.setMessage("Wherever the causing of a certain effect, or an attempt to cause that effect, by an act or by an omission, is an offence, it is to be understood that the causing of that effect partly by an act and partly by an omission is the same offence")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if (position == 36) {
                    alertBuilder.setMessage("When an offence is committed by means of several acts, whoever intentionally co-operates in the commission of that offence by doing any one of those acts, either singly or jointly with any other person, commits that offence.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if (position == 37) {
                    alertBuilder.setMessage("Where several persons are engaged or concerned in the commission of a criminal act, they may be guilty of different offences by means of that act.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if (position == 38) {
                    alertBuilder.setMessage("A person is said to cause an effect “voluntarily” when he causes it by means whereby he intended to cause it, or by means which, at the time of employing those means, he knew or had reason to believe to be likely to cause it.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if (position == 39) {
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

                if (position == 40) {
                    alertBuilder.setMessage("A “special law” is a law applicable to a particular subject.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if (position == 41) {
                    alertBuilder.setMessage("A “local law” is a law applicable only to a particular part of 7[8***9[India]].")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if (position == 42) {
                    alertBuilder.setMessage("The word “illegal” is applicable to everything which is an offence or which is prohibited by law, or which furnishes ground for a civil action; and a person is said to be “legally bound to do” whatever it is illegal in him to omit.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if (position == 43) {
                    alertBuilder.setMessage("The word “injury” denotes any harm whatever illegally caused to any person, in body, mind, reputation or property..")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if (position == 44) {
                    alertBuilder.setMessage("The word “life” denotes the life of a human being, unless the contrary appears from the context.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if (position == 45) {
                    alertBuilder.setMessage("The word “death” denotes the death of a human being unless the contrary appears from the context.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if (position == 46) {
                    alertBuilder.setMessage("The word “animal” denotes any living creature, other than a human being.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if (position == 47) {
                    alertBuilder.setMessage("The word “vessel” denotes anything made for the conveyance by water of human\n" +
                            "beings or of property")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if (position == 48) {
                    alertBuilder.setMessage("Wherever the word “year” or the word “month” is used, it is to be understood that the year or the month is to be reckoned according to the British calendar.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }

                if (position == 49) {
                    alertBuilder.setMessage("The word “section” denotes one of those portions of a Chapter of this Code which are distinguished by prefixed numeral figures.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if (position ==50 ) {
                    alertBuilder.setMessage("The word “oath” includes a solemn affirmation substituted by law for an oath, and any declaration required or authorised by law to be made before a public servant or to be used for the purpose of proof, whether in a Court of Justice or not.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if (position ==51 ) {
                    alertBuilder.setMessage("Nothing is said to be done or believed in “good faith” which is done or believed without due care and attention.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if (position ==52 ) {
                    alertBuilder.setMessage("“Harbour”.—Except in section 157, and in section 130 in the case in which the harbour is\n" +
                            "given by the wife or husband of the person harboured, the word “harbour” includes the supplying a person\n" +
                            "with shelter, food, drink, money, clothes, arms, ammunition or means of conveyance, or the assisting a\n" +
                            "person by any means, whether of the same kind as those enumerated in this section or not, to evade\n" +
                            "apprehension.]")
                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if (position ==53 ) {
                    alertBuilder.setMessage(" Punishments.—The punishments to which offenders are liable under the provisions of this Code are --\n First.—Death;\n\n\n[Secondly.—Imprisonment for life;]\n"+"3 \t*  *  *  *  * \n\n Fourthly.—Imprisonment, which is of two descriptions, namely:—\n (1) Rigorous, that is, with hard labour \t (2) Simple;\n\n Fifthly.—Forfeiture of property;\n Sixthly.—Fine.\n\n\n")
                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if (position == 54) {
                    alertBuilder.setMessage("[53A. Construction of reference to transportation.—(1) Subject to the provisions of\n" +
                            "sub-section (2) and sub-section (3), any reference to “transportation for life” in any other law for the time\n" +
                            "being in force or in any instrument or order having effect by virtue of any such law or of any enactment\n" +
                            "repealed shall be construed as a reference to “imprisonment for life”.\n" +
                            "(2) In every case in which a sentence of transportation for a term has been passed before the\n" +
                            "commencement of the Code of Criminal Procedure (Amendment) Act, 5\n" +
                            "\n" +
                            "[1955 (26 of 1955)], the offender\n" +
                            "shall be dealt with in the same manner as if sentenced to rigorous imprisonment for the same term.\n" +
                            "(3) Any reference to transportation for a term or to transportation for any shorter term (by whatever\n" +
                            "name called) in any other law for the time being in force shall be deemed to have been omitted.\n" +
                            "(4) Any reference to “transportation” in any other law for the time being in force shall,—\n" +
                            "(a) if the expression means transportation for life, be construed as a reference to imprisonment for\n" +
                            "life;\n" +
                            "(b) if the expression means transportation for any shorter term, be deemed to have been omitted.]")
                                    .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }if (position ==55) {
                    alertBuilder.setMessage("In every case in which sentence of death shall have been\n" +
                            "passed, 6\n" +
                            "[the appropriate Government] may, without the consent of the offender, commute the punishment\n" +
                            "punishment for any other punishment provided by this Code.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }if (position == 56) {
                    alertBuilder.setMessage("In every case in which sentence of  [imprisonment] for life shall have been passed, [the appropriate Government] may, without the consent consent of the offender, commute the punishment for imprisonment of either description for a term not exceeding fourteen years.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }if (position == 57) {
                    alertBuilder.setMessage("Government”.—In sections fifty-four and fifty-five the\n" +
                            "expression “appropriate Government” means,—\n" +
                            "(a) in cases where the sentence is a sentence of death or is for an offence against any law relating\n" +
                            "to a matter to which the executive power of the Union extends, the Central Government; and\n" +
                            "(b) in cases where the sentence (whether of death or not) is for an offence against any law relating\n" +
                            "to a matter to which the executive power of the State extends, the Government of the State within\n" +
                            "which the offender is sentenced.]")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if (position ==58 ) {
                    alertBuilder.setMessage("[Sentence of Europeans and Americans to penal servitude. Proviso as to sentence for term\n" +
                            "exceeding ten years but not for life.] Rep. by the Criminal Law (Removal of Racial Discriminations) Act,\n" +
                            "1949 (17 of 1949) (w. e. f. 6-4-1949).")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if (position ==59 ) {
                    alertBuilder.setMessage("In calculating fractions of terms of punishment,[imprisonment] for life shall be reckoned as equivalent to [imprisonment] for twenty years.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if (position ==60 ) {
                    alertBuilder.setMessage("[Offenders sentenced to transportation how dealt with until transported.] Rep. by the Code of Criminal Procedure (Amendment) Act, 1955 (26 of 1955), s. 117 and the Sch. (w.e.f. 1-1-1956).")
                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if (position ==61 ) {
                    alertBuilder.setMessage(" [Transportation instead of imprisonment.] Rep. by s.117 and the Sch., ibid. (w.e.f. 1-1-1956).")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if (position == 62) {
                    alertBuilder.setMessage("In every case in which an offender is punishable with imprisonment which may be of either description, it\n" +
                            "shall be competent to the Court which sentences such offender to direct in the sentence that such\n" +
                            "imprisonment shall be wholly rigorous, or that such imprisonment shall be wholly simple, or that any part\n" +
                            "of such imprisonment shall be rigorous and the rest simple.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if (position == 63) {
                    alertBuilder.setMessage("[Sentence of forfeiture of property.] Rep. by the Indian Penal Code (Amendment) Act, 1921\n" +
                            "(16 of 1921), s. \n" )
                             .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if (position == 64) {
                    alertBuilder.setMessage(" 62. [Forfeiture of property, in respect of offenders punishable with death, transportation or imprisonment.] Rep. by s. 4 ibid.")
                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }


                if (position ==65 ) {
                    alertBuilder.setMessage("63. Amount of fine.—Where no sum is expressed to which a fine may extend, the amount of fine to which the offender is liable is unlimited, but shall not be excessive.")
                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if (position ==66 ) {
                    alertBuilder.setMessage("[In every case of an offence punishable with imprisonment as well as fine, in which the offender is sentenced to a fine, whether with or without imprisonment,and in every case of an offence punishable [with imprisonment or fine, or] with fine only, in which the offender is sentenced to a fine.] it shall be competent to the Court which sentences such offender to direct by the sentence that, in default of payment of the fine, the offender shall suffer imprisonment for a certain term, which imprisonment shall be in excess of any other imprisonment to which he may have been sentenced or to which he may be liable under a commutation of a sentence.")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if (position ==67 ) {
                    alertBuilder.setMessage("")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if (position ==68 ) {
                    alertBuilder.setMessage("")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                if (position == 69) {
                    alertBuilder.setMessage("")

                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                }
                AlertDialog alert = alertBuilder.create();
                alert.setTitle(criminalLaws.get(position));
                alert.show();
            }

        });


        return v;
    }
}


