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

        corporateLaw.add("The Companies Act, 1956");
        corporateLaw.add("Companies (Foreign Interests) Act, 1918");
        corporateLaw.add("Company Law Board Regulations, 1991");
        corporateLaw.add("The Companies (Amendment) Act, 2006");
        corporateLaw.add("The Company Secretaries Act, 1980");
        corporateLaw.add("The Companies (Donations to National Funds) Act, 1951");
        corporateLaw.add("The Depositories Act, 1996");
        corporateLaw.add("The Foreign Trade (Development and Regulation) Act, 1992");
        corporateLaw.add("The Hire-Purchase Act, 1972");
        corporateLaw.add("Indian Contract Act, 1872");
        corporateLaw.add("The National Securities And Depositories Limited – Byelaws, 1996");
        corporateLaw.add("The Prevention of Money-Laundering Bill, 1999");
        corporateLaw.add("Prevention of Money Laundering Act, 2002");
        corporateLaw.add("Prevention of Money-Laundering (Amendment) Act, 2005");
        corporateLaw.add("The Partnership Act, 1932");
        corporateLaw.add("The Securities Contract (Regulation) Act, 1956");
        corporateLaw.add("The Sick Industrial Companies Act, 1985");
        corporateLaw.add("The Sale of Goods Act, 1930");
        corporateLaw.add("The Swadeshi Cotton Mills Company Limited (Acquisition and Transfer of Undertakings) Act, 1986");
        corporateLaw.add("The Tea Act, 1953");
        corporateLaw.add("The State Financial Corporation Act, 1951");
        corporateLaw.add("The State Financial Corporations (Amendment) Act, 2000");

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
                    alertBuilder.setMessage(" An act to provide for the acquisition and transfer of certain textile undertakings of the Swadeshi Cotton Mills Company Limited, with a view to securing the proper management of such undertakings so as to subserve the interests of the general public by ensuring the continued manufacture, production and distribution of different varieties of cloth and yarn. The act was introduced on 30th May 1986.")

                            .setCancelable(false)
                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();

                                }


                            });

                }

                if (position == 18) {
                    alertBuilder.setMessage("An act to provide for the control by the Union of the tea industry, including the control, in pursuance of the International Agreement now in force, of the cultivation of tea in, and of the export of tea from, India and for that purpose to establish a Tea Board and Levy a duty of excise on tea produced in India. The act was introduced on 28th May 1953.")

                            .setCancelable(false)
                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();

                                }


                            });

                }

                if (position == 19) {
                    alertBuilder.setMessage("An act to provide for the establishment of State Financial Corporations. The act was introduced on 31st October, 1951.")

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

