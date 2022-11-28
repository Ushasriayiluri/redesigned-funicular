package uk.ac.tees.mad.w9553142.helpline;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DoctorUpcommingAppointmentFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DoctorUpcommingAppointmentFragment extends Fragment {

    FragmentDoctorUpcommingAppointmentBinding binding;
    ArrayList dateArray = new ArrayList<String>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DoctorUpcommingAppointmentFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DoctorUpcommingAppointmentFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DoctorUpcommingAppointmentFragment newInstance(String param1, String param2) {
        DoctorUpcommingAppointmentFragment fragment = new DoctorUpcommingAppointmentFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        binding = FragmentDoctorUpcommingAppointmentBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }

    void init()
    {
        for (int i = 0 ; i <= 6 ; i++)
        {
            Calendar calendar = new GregorianCalendar();
            calendar.add(Calendar.DATE, i);
            setupDateBar(i , calendar.getTime());
        }
    }

    void setupDateBar(int position , Date date)
    {
        dateArray.add(""+ DateFormat.format("yyyy-MM-dd", date));

        if(position == 0)
        {
            binding.tvDate.setText(""+ DateFormat.format("MMM dd,yyyy", date));
            binding.inDateBar.tvDay1.setText(""+DateFormat.format("EEE", date));
            binding.inDateBar.tvDate1.setText(""+DateFormat.format("dd", date));
            binding.inDateBar.tvMonth1.setText(""+DateFormat.format("MMM", date));
        }
        else if(position == 1)
        {
            binding.inDateBar.tvDay2.setText(""+DateFormat.format("EEE", date));
            binding.inDateBar.tvDate2.setText(""+DateFormat.format("dd", date));
            binding.inDateBar.tvMonth2.setText(""+DateFormat.format("MMM", date));
        }
        else if(position == 2)
        {
            binding.inDateBar.tvDay3.setText(""+DateFormat.format("EEE", date));
            binding.inDateBar.tvDate3.setText(""+DateFormat.format("dd", date));
            binding.inDateBar.tvMonth3.setText(""+DateFormat.format("MMM", date));
        }
        else if(position == 3)
        {
            binding.inDateBar.tvDay4.setText(""+DateFormat.format("EEE", date));
            binding.inDateBar.tvDate4.setText(""+DateFormat.format("dd", date));
            binding.inDateBar.tvMonth4.setText(""+DateFormat.format("MMM", date));
        }
        else if(position == 4)
        {
            binding.inDateBar.tvDay5.setText(""+DateFormat.format("EEE", date));
            binding.inDateBar.tvDate5.setText(""+DateFormat.format("dd", date));
            binding.inDateBar.tvMonth5.setText(""+DateFormat.format("MMM", date));
        }
        else if(position == 5)
        {
            binding.inDateBar.tvDay6.setText(""+DateFormat.format("EEE", date));
            binding.inDateBar.tvDate6.setText(""+DateFormat.format("dd", date));
            binding.inDateBar.tvMonth6.setText(""+DateFormat.format("MMM", date));
        }
        else if(position == 6)
        {
            binding.inDateBar.tvDay7.setText(""+DateFormat.format("EEE", date));
            binding.inDateBar.tvDate7.setText(""+DateFormat.format("dd", date));
            binding.inDateBar.tvMonth7.setText(""+DateFormat.format("MMM", date));
        }
    }
}