package com.android.example.module06_module227_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: com.android.example.module06_module298_module3.ClassAAD = com.android.example.module06_module298_module3.ClassAAD()
	private 	val instance_var_1_1: com.android.example.module06_module227_module3.ClassAAJ = com.android.example.module06_module227_module3.ClassAAJ()
	private 	val instance_var_1_2: com.android.example.module06_module298_module3.ClassAAA = com.android.example.module06_module298_module3.ClassAAA()
	private 	val instance_var_1_3: com.android.example.module06_module227_module3.ClassAAE = com.android.example.module06_module227_module3.ClassAAE()
	private 	val instance_var_1_4: com.android.example.module06_module227_module3.ClassAAC = com.android.example.module06_module227_module3.ClassAAC()

	fun method0(
		param0: com.android.example.module06_module227_module3.ClassAAF,
		param1: com.android.example.module06_module227_module3.ClassAAD,
		param2: com.android.example.module06_module298_module3.ClassAAH,
		param3: com.android.example.module06_module298_module3.ClassAAE
	) {
		val local_var_2_4: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
		local_var_2_4.createWorker()

		for (iAb in 0..3) {
			for (iAc in 0..4) {
				param0.method1("SomeString", "SomeString")

				val local_var_4_0: io.reactivex.internal.schedulers.ComputationScheduler = io.reactivex.internal.schedulers.ComputationScheduler()
				local_var_4_0.createWorker()

			}
			val local_var_3_0: io.reactivex.internal.schedulers.ComputationScheduler = io.reactivex.internal.schedulers.ComputationScheduler()
			local_var_3_0.shutdown()

			val local_var_3_1: io.reactivex.internal.schedulers.NewThreadScheduler = io.reactivex.internal.schedulers.NewThreadScheduler()
			local_var_3_1.createWorker()

		}
	}

	fun method1(
		param0: com.android.example.module06_module227_module3.ClassAAC,
		param1: com.android.example.module06_module227_module3.ClassAAF,
		param2: com.android.example.module06_module298_module3.ClassAAI
	) {
		param0.method4("SomeString", "SomeString")

	}
}
