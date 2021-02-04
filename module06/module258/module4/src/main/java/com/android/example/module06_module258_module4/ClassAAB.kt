package com.android.example.module06_module258_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: com.android.example.module06_module257_module3.ClassAAF = com.android.example.module06_module257_module3.ClassAAF()
	private 	val instance_var_1_1: com.android.example.module06_module295_module6.ClassAAC = com.android.example.module06_module295_module6.ClassAAC()

	fun method0(
		param0: com.android.example.module06_module257_module3.ClassAAC,
		param1: com.android.example.module06_module295_module6.ClassAAA,
		param2: com.android.example.module06_module257_module3.ClassAAJ,
		param3: com.android.example.module06_module295_module6.ClassAAI
	) {
		val local_var_2_4: com.android.example.module06_module109_module1.ClassAAF = com.android.example.module06_module109_module1.ClassAAF()
		local_var_2_4.method0("SomeString")

		for (iAb in 0..4) {
			val local_var_3_0: com.android.example.module06_module321_module10.ClassAAA = com.android.example.module06_module321_module10.ClassAAA()
			local_var_3_0.method1("SomeString", "SomeString")

			val local_var_3_1: com.android.example.module06_module321_module10.ClassAAF = com.android.example.module06_module321_module10.ClassAAF()
			local_var_3_1.method2("SomeString", "SomeString")

			val local_var_3_2: com.android.example.module06_module109_module1.ClassAAJ = com.android.example.module06_module109_module1.ClassAAJ()
			local_var_3_2.method1("SomeString", "SomeString", "SomeString", "SomeString")

		}
		param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method1(
		param0: com.android.example.module06_module257_module3.ClassAAI,
		param1: com.android.example.module06_module257_module3.ClassAAI,
		param2: com.android.example.module06_module295_module6.ClassAAD
	) {
		param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.disposables.SerialDisposable())

		val local_var_2_3: com.android.example.module06_module109_module1.ClassAAD = com.android.example.module06_module109_module1.ClassAAD()
		local_var_2_3.method3("SomeString", "SomeString", "SomeString")

		val local_var_2_4: com.android.example.module06_module321_module10.ClassAAC = com.android.example.module06_module321_module10.ClassAAC()
		local_var_2_4.method0("SomeString", "SomeString")

		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.schedulers.SingleScheduler(), io.reactivex.internal.disposables.ListCompositeDisposable())

	}
}
