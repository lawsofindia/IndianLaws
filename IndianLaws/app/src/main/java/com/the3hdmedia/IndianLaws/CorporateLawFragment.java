package com.the3hdmedia.IndianLaws;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.MainThread;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class CorporateLawFragment extends Fragment {


    public CorporateLawFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        final View v = inflater.inflate(R.layout.fragment_corporate_law,container,false);
        final ArrayList<String> corporateLaw = new ArrayList<String>();

        ListView listView = (ListView)v.findViewById(R.id.listview_corporateLaw);

        corporateLaw.add("1. The Companies Act, 1956");
        corporateLaw.add("2. Companies (Foreign Interests) Act, 1918");
        corporateLaw.add("3. Company Law Board Regulations, 1991");
        corporateLaw.add("4. The Companies (Amendment) Act, 2006");
        corporateLaw.add("5. The Company Secretaries Act, 1980");
        corporateLaw.add("6. The Companies (Donations to National Funds) Act, 1951");
        corporateLaw.add("7. The Depositories Act, 1996");
        corporateLaw.add("8. The Foreign Trade (Development and Regulation) Act, 1992");
        corporateLaw.add("9. The Hire-Purchase Act, 1972");
        corporateLaw.add("10. Indian Contract Act, 1872");
        corporateLaw.add("11. The National Securities And Depositories Limited – Byelaws, 1996");
        corporateLaw.add("12. The Prevention of Money-Laundering Bill, 1999");
        corporateLaw.add("13. Prevention of Money Laundering Act, 2002");
        corporateLaw.add("14. Prevention of Money-Laundering (Amendment) Act, 2005");
        corporateLaw.add("15. The Partnership Act, 1932");
        corporateLaw.add("16. The Securities Contract (Regulation) Act, 1956");
        corporateLaw.add("17. The Sick Industrial Companies Act, 1985");
        corporateLaw.add("18. The Sale of Goods Act, 1930");
        corporateLaw.add("19. The Swadeshi Cotton Mills Company Limited (Acquisition and Transfer of Undertakings) Act, 1986");
        corporateLaw.add("20. The Tea Act, 1953");
        corporateLaw.add("21. The State Financial Corporation Act, 1951");
        corporateLaw.add("22. The State Financial Corporations (Amendment) Act, 2000");
        corporateLaw.add("23. Special Economic Zones Act, 2005");
        corporateLaw.add("24. The Tea Companies (Acquisition and Transfer of Sick Tea Units) Act, 1985:");
        corporateLaw.add("25. Tyre-Corporation-of-India-Limited-(Disinvestment-of-Ownership)-Act-2007");
        corporateLaw.add("26. The Securities and Exchange Board of India Act, 1992");
        corporateLaw.add("27. Securities and Insurance Laws (Amendment and Validation) Act, 2010");
        corporateLaw.add("28. Securities Contracts (Regulation) Amendment Act, 2007");
        corporateLaw.add("29. Securities Laws (Amendment) Act, 2004");
        corporateLaw.add("30. Securitization and Reconstruction of Financial Assets and Enforcement of Security Interest Act, 2002");
        corporateLaw.add("31. The Rubber Act, 1947");
        corporateLaw.add("32. The Faridabad Development Corporation Act, 1956");


        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(v.getContext(), android.R.layout.simple_list_item_1, corporateLaw);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    AlertDialog.Builder alertBuilder = new AlertDialog.Builder(v.getContext());
                    if (position == 0) {
                    alertBuilder.setMessage("An act to consolidate and amend the law relating to companies and certain other associations. The act was introduced on 18th January, 1956.")

                            .setCancelable(false)
                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();

                                }


                            });

                }

                if (position == 1) {
                    alertBuilder.setMessage("An act to take power to prohibit the alteration of articles of association, which restrict foreign interests in certain companies, but with the sanction of the Government. The act was introduced on 26th September 1918.")

                            .setCancelable(false)
                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();

                                }


                            });

                }

                if (position == 2) {
                    alertBuilder.setMessage("In this act all the powers conferred by sub-section (6) of section 10 E of the Companies Act, 1956, the Company Law Board are included. The act was introduced in the year 1991.")

                            .setCancelable(false)
                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();

                                }


                            });

                }

                if (position == 3) {
                    alertBuilder.setMessage("An act for the further amendments in the Companies Act, 1956. The changes included that no company shall appoint or re-appoint any individual as director of the company unless he has been allotted a director Identification number under section 266B. The act was introduced on 29th May, 2006. ")

                            .setCancelable(false)
                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();

                                }


                            });

                }

                if (position == 4) {
                    alertBuilder.setMessage("An act to make provision for the regulation and development of the profession of Company Secretaries. The act was introduced on 10th December 1980.")

                            .setCancelable(false)
                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();

                                }


                            });

                }

                if (position == 5) {
                    alertBuilder.setMessage("An act to enable companies to make donations to national funds. The act was introduced on 17th October, 1951.")

                            .setCancelable(false)
                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();

                                }


                            });

                }

                if (position == 6) {
                    alertBuilder.setMessage("An act for regulation of depositories in securities. The act was introduced on 12th August, 1992.")

                            .setCancelable(false)
                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();

                                }


                            });

                }

                if (position == 7) {
                    alertBuilder.setMessage("An act for the development and regulation of foreign trade by facilitating imports into, and augmenting exports from India. The act was introduced on 7th August, 1992. ")

                            .setCancelable(false)
                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();

                                }


                            });

                }

                if (position == 8) {
                    alertBuilder.setMessage("An act to regulate the hire-purchase transactions, for the protection to buyer of the goods on hire-purchase, to control certain abuses in the hire-purchase trading. The act was introduced on 8th June, 1972.")

                            .setCancelable(false)
                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();

                                }


                            });

                }

                if (position == 9) {
                    alertBuilder.setMessage("The act defines the term “contract” as an agreement legally enforceable by law, for the formation of a contract there must be an agreement, the agreement should be enforceable by law. The act was introduced on 25 April 1872.")

                            .setCancelable(false)
                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();

                                }


                            });

                }

                if (position == 10) {
                    alertBuilder.setMessage("An act for the implementation of the powers conferred under the Depository Act, 1996, with the approval of Securities Exchange Board of India (SEBI). The act was introduced on 15th October, 1996.")

                            .setCancelable(false)
                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();

                                }


                            });

                }

                if (position == 11) {
                    alertBuilder.setMessage("A Bill to prevent money-laundering and for appropriation of property derived from, or involved in, money-laundering. The act was introduced on 23rd February, 1999.")

                            .setCancelable(false)
                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();

                                }


                            });

                }

                if (position == 12) {
                    alertBuilder.setMessage("An act to form the core of the legal framework put in place by India to combat money laundering. The act was introduced on 1st July, 2005.")

                            .setCancelable(false)
                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();

                                }


                            });

                }

                if (position == 13) {
                    alertBuilder.setMessage("An Act to amend the Prevention of Money-Laundering Act, 2002. The act was introduced on 21st May, 2005.")

                            .setCancelable(false)
                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();

                                }


                            });

                }

                if (position == 14) {
                    alertBuilder.setMessage("An act to define and amend the law related to Partnership and define partnership as “An agreement between two or more persons who have agreed to share profits of the business carried on by all or any one of them acting upon all”. The act was introduced on 8th April, 1932.")

                            .setCancelable(false)
                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();

                                }


                            });

                }

                if (position == 15) {
                    alertBuilder.setMessage("An act to prevent undesirable transactions in securities by regulating the business of dealing therein. The act came into force with effect from 20th February 1957.")

                            .setCancelable(false)
                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();

                                }


                            });

                }

                if (position == 16) {
                    alertBuilder.setMessage(" An act to make, in the public interest, special provisions with a view to securing the timely detection of sick and potentially sick companies owning industrial undertakings, the speedy determination by a Board of experts of the preventive, ameliorative, remedial and other measures which need to be taken with respect to such companies and the expeditious enforcement of the measures so determined. The act was introduced on 8th January 1986.")

                            .setCancelable(false)
                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();

                                }


                            });

                }
                if (position == 17) {
                    alertBuilder.setMessage(" An act to define and amend the law relating to the sale of goods and it defines and amends the law relating to the sale of goods. The act was introduced on 15th March 1930.")
                            .setCancelable(false)
                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();

                                }


                            });

                }

                if (position == 18) {
                    alertBuilder.setMessage(" An act to provide for the acquisition and transfer of certain textile undertakings of the Swadeshi Cotton Mills Company Limited, with a view to securing the proper management of such undertakings so as to subserve the interests of the general public by ensuring the continued manufacture, production and distribution of different varieties of cloth and yarn. The act was introduced on 30th May 1986.")

                            .setCancelable(false)
                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();

                                }


                            });

                }

                if (position == 19) {
                    alertBuilder.setMessage("An act to provide for the control by the Union of the tea industry, including the control, in pursuance of the International Agreement now in force, of the cultivation of tea in, and of the export of tea from, India and for that purpose to establish a Tea Board and Levy a duty of excise on tea produced in India. The act was introduced on 28th May 1953.")

                            .setCancelable(false)
                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();

                                }


                            });

                }

                if (position == 20) {
                    alertBuilder.setMessage("An act to provide for the establishment of State Financial Corporations. The act was introduced on 31st October, 1951.")

                            .setCancelable(false)
                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();

                                }


                            });

                }
                if (position == 21) {
                    alertBuilder.setMessage("An act further to amend the State Financial Corporations Act, 1951. The act was introduced on 5th September, 2000.")
                            .setCancelable(false)
                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();

                                }


                            });

                }
                if (position == 22) {
                    alertBuilder.setMessage("An act to provide for the establishment, development and management of the Special Economic Zones for the promotion of exports. The act was introduced on 23rd June 2005..")

                            .setCancelable(false)
                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();

                                }


                            });

                }if (position == 23) {
                    alertBuilder.setMessage(" An Act to provide for the acquisition and transfer of the sick tea units specified in the First Schedule and the right, title and interest of the tea companies in respect of the said tea units with a view to securing proper reorganization and management of such tea units so as to subserve the interests of the general public by augmenting the production and manufacture of different varieties of tea which are essential to the needs of the economy of the country. The act was introduced on 28th May 1985.")

                            .setCancelable(false)
                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();

                                }


                            });

                }if (position ==24 ) {
                    alertBuilder.setMessage("An Act to provide for disinvestment of Government’s equity in the Tyre Corporation of India Limited. The act was introduced on 12th December, 2007.")

                            .setCancelable(false)
                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();

                                }


                            });


                }if (position == 25) {
                    alertBuilder.setMessage("An act to provide for the establishment of a Board to protect the interests of investors in securities and to promote the development of, and to regulate, the securities market. The act was introduced on 4 April 1992.")

                            .setCancelable(false)
                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();

                                }


                            });

                }

                if (position ==26 ) {
                    alertBuilder.setMessage(" An act further to amend the Reserve Bank of India Act, 1934, the Insurance Act, 1938, the Securities Contracts (Regulation) Act, 1956 and the Securities and Exchange Board of India Act, 1992. The act was introduced on 20th August 2010.")

                            .setCancelable(false)
                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();

                                }


                            });

                }if (position ==27 ) {
                    alertBuilder.setMessage("An act further to amend the Securities Contracts (Regulation) Act, 1956. The act was introduced on 28th May 2007.")

                            .setCancelable(false)
                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();

                                }


                            });

                }if (position ==28 ) {
                    alertBuilder.setMessage("An act further to amend the Securities Contracts (Regulation) Act, 1956 and the Depositories Act, 1996. The act was introduced on 6th January 2005.")

                            .setCancelable(false)
                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();

                                }


                            });

                }if (position == 29) {
                    alertBuilder.setMessage(" An Act to regulate securitization and reconstruction of financial assets and enforcement of security interest. The act was introduced on 21st June 2002.")

                            .setCancelable(false)
                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();

                                }


                            });

                }if (position ==30 ) {
                    alertBuilder.setMessage("An act to provide for the development 2[under the control of the Union] of the rubber industry. The act was introduced on 18th April 1947.\n" )

                            .setCancelable(false)
                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();

                                }


                            });

                }if (position == 31) {
                    alertBuilder.setMessage("An Act to provide for the establishment and regulation of a trading Corporation for the purpose of carrying on and promoting trade and industry in the town of Faridabad, assisting in the rehabilitation of displaced persons settled therein. The act was introduced on 28th December 1956.")

                            .setCancelable(false)
                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();

                                }


                            });

                }


                AlertDialog alert = alertBuilder.create();
                    alert.setTitle(corporateLaw.get(position));
                    alert.show();
            }




        });

        return v;

        }
    }

