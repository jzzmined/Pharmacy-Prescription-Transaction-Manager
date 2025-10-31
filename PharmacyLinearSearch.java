package FinalProject;

import java.util.ArrayList;

public class PharmacyLinearSearch {

    private ArrayList<String[]> prescriptionData;

    public PharmacyLinearSearch() {
        prescriptionData = new ArrayList<>();
        loadPrescriptionData();
    }
    private void loadPrescriptionData() {
        prescriptionData.add(new String[]{"Headache", "Ibuprofen", "Paracetamol", "Aspirin", "Naproxen", "Diclofenac"});
        prescriptionData.add(new String[]{"Fever", "Paracetamol", "Ibuprofen", "Acetaminophen", "Aspirin", "Mefenamic Acid"});
        prescriptionData.add(new String[]{"Cold", "Phenylephrine", "Pseudoephedrine", "Cetirizine", "Chlorpheniramine", "Loratadine"});
        prescriptionData.add(new String[]{"Cough", "Dextromethorphan", "Guaifenesin", "Ambroxol"});
        prescriptionData.add(new String[]{"Allergy", "Loratadine", "Cetirizine", "Fexofenadine"});
        prescriptionData.add(new String[]{"Asthma", "Albuterol", "Budesonide", "Fluticasone"});
        prescriptionData.add(new String[]{"Diabetes", "Metformin", "Glipizide", "Insulin"});
        prescriptionData.add(new String[]{"Hypertension", "Lisinopril", "Amlodipine", "Losartan"});
        prescriptionData.add(new String[]{"Anxiety", "Alprazolam", "Diazepam", "Lorazepam"});
        prescriptionData.add(new String[]{"Depression", "Sertraline", "Fluoxetine", "Escitalopram"});
        prescriptionData.add(new String[]{"Insomnia", "Melatonin", "Zolpidem", "Trazodone"});
        prescriptionData.add(new String[]{"Arthritis", "Naproxen", "Celecoxib", "Diclofenac"});
        prescriptionData.add(new String[]{"Acid Reflux", "Omeprazole", "Pantoprazole", "Esomeprazole"});
        prescriptionData.add(new String[]{"Nausea", "Ondansetron", "Metoclopramide", "Dimenhydrinate"});
        prescriptionData.add(new String[]{"Diarrhea", "Loperamide", "Bismuth Subsalicylate", "Racecadotril"});
        prescriptionData.add(new String[]{"Constipation", "Docusate", "Lactulose", "Psyllium"});
        prescriptionData.add(new String[]{"Migraine", "Sumatriptan", "Rizatriptan", "Propranolol"});
        prescriptionData.add(new String[]{"Infection", "Amoxicillin", "Azithromycin", "Cefalexin"});
        prescriptionData.add(new String[]{"Pain", "Tramadol", "Oxycodone", "Morphine"});
        prescriptionData.add(new String[]{"Inflammation", "Prednisone", "Dexamethasone", "Hydrocortisone"});
        prescriptionData.add(new String[]{"Cholesterol", "Atorvastatin", "Simvastatin", "Rosuvastatin"});
        prescriptionData.add(new String[]{"Blood Clot", "Warfarin", "Apixaban", "Rivaroxaban"});
        prescriptionData.add(new String[]{"Pneumonia", "Levofloxacin", "Ceftriaxone", "Azithromycin"});
        prescriptionData.add(new String[]{"UTI", "Ciprofloxacin", "Nitrofurantoin", "Amoxicillin"});
        prescriptionData.add(new String[]{"Skin Rash", "Hydrocortisone", "Triamcinolone", "Clobetasol"});
        prescriptionData.add(new String[]{"Eczema", "Betamethasone", "Tacrolimus", "Mometasone"});
        prescriptionData.add(new String[]{"Fungal Infection", "Fluconazole", "Clotrimazole", "Ketoconazole"});
        prescriptionData.add(new String[]{"Herpes", "Acyclovir", "Valacyclovir", "Famcicivir"});
        prescriptionData.add(new String[]{"Seizures", "Carbamazepine", "Valproate", "Levetiracetam"});
        prescriptionData.add(new String[]{"Thyroid", "Levothyroxine", "Liothyronine", "Methimazole"});
        prescriptionData.add(new String[]{"Osteoporosis", "Alendronate", "Risedronate", "Calcitonin"});
        prescriptionData.add(new String[]{"Gout", "Allopurinol", "Colchicine", "Febuxostat"});
        prescriptionData.add(new String[]{"Menopause", "Estrogen", "Progesterone", "Raloxifene"});
        prescriptionData.add(new String[]{"Birth Control", "Ethinyl Estradiol", "Levonorgestrel", "Drospirenone"});
        prescriptionData.add(new String[]{"Erectile Dysfunction", "Sildenafil", "Tadalafil", "Vardenafil"});
        prescriptionData.add(new String[]{"Glaucoma", "Latanoprost", "Timolol", "Brimonidine"});
        prescriptionData.add(new String[]{"Dry Eyes", "Cyclosporine", "Lifitegrast", "Artificial Tears"});
        prescriptionData.add(new String[]{"Anemia", "Ferrous Sulfate", "Folic Acid", "Vitamin B12"});
        prescriptionData.add(new String[]{"Vitamin Deficiency", "Vitamin D", "Vitamin C", "Multivitamins"});
        prescriptionData.add(new String[]{"ADHD", "Methylphenidate", "Amphetamine", "Atomoxetine"});
        prescriptionData.add(new String[]{"Bipolar Disorder", "Lithium", "Valproate", "Lamotrigine"});
        prescriptionData.add(new String[]{"Schizophrenia", "Risperidone", "Olanzapine", "Clozapine"});
        prescriptionData.add(new String[]{"OCD", "Clomipramine", "Fluvoxamine", "Sertraline"});
        prescriptionData.add(new String[]{"PTSD", "Paroxetine", "Venlafaxine", "Sertraline"});
        prescriptionData.add(new String[]{"Smoking Cessation", "Varenicline", "Bupropion", "Nicotine Patch"});
        prescriptionData.add(new String[]{"Weight Loss", "Orlistat", "Phentermine", "Liraglutide"});
        prescriptionData.add(new String[]{"Acne", "Isotretinoin", "Adapalene", "Clindamycin"});
        prescriptionData.add(new String[]{"Hair Loss", "Finasteride", "Minoxidil", "Dutasteride"});
        prescriptionData.add(new String[]{"Vertigo", "Meclizine", "Betahistine", "Dimenhydrinate"});
        prescriptionData.add(new String[]{"Muscle Spasm", "Cyclobenzaprine", "Baclofen", "Methocarbamol"});
    }
    public void linearSearchWithRuntime(String condition) {
        long startTime = System.nanoTime();

        boolean found = false;
        for (int i = 0; i < prescriptionData.size(); i++) {
            String[] entry = prescriptionData.get(i);
            if (entry[0].equalsIgnoreCase(condition)) {
                found = true;
                break;
            }
        }
        long endTime = System.nanoTime();
        double runtimeMs = (endTime - startTime) / 1_000_000.0;

    }
}
