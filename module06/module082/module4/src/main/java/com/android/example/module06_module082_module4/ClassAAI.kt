package com.android.example.module06_module082_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: com.android.example.module04_module19_module6.ClassAAG = com.android.example.module04_module19_module6.ClassAAG()
	private 	val instance_var_1_1: com.android.example.module04_module19_module6.ClassAAB = com.android.example.module04_module19_module6.ClassAAB()
	private 	val instance_var_1_2: com.android.example.module04_module19_module6.ClassAAJ = com.android.example.module04_module19_module6.ClassAAJ()
	private 	val instance_var_1_3: com.android.example.module04_module19_module6.ClassAAF = com.android.example.module04_module19_module6.ClassAAF()

	fun method0(
		param0: com.android.example.module04_module19_module6.ClassAAB,
		param1: com.android.example.module04_module19_module6.ClassAAD,
		param2: com.android.example.module04_module19_module6.ClassAAG
	) {
		listOf("1", "2", "3").forEach {
			val local_var_3_0: com.android.example.module04_module19_module6.ClassAAI = com.android.example.module04_module19_module6.ClassAAI()
			local_var_3_0.method2(io.reactivex.subscribers.TestSubscriber())

			for (iAb in 0..1) {
				val local_var_4_0: com.android.example.module04_module19_module6.ClassAAA = com.android.example.module04_module19_module6.ClassAAA()
				local_var_4_0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable())

			}
		}
	}

	fun method1(
		param0: com.android.example.module04_module19_module6.ClassAAB,
		param1: com.android.example.module04_module19_module6.ClassAAD
	) {
		val local_var_2_2: com.android.example.module04_module19_module6.ClassAAB = com.android.example.module04_module19_module6.ClassAAB()
		local_var_2_2.method0(io.reactivex.internal.schedulers.SingleScheduler(), io.reactivex.internal.disposables.ListCompositeDisposable())

	}

	fun method2(
		param0: com.android.example.module04_module19_module6.ClassAAF,
		param1: com.android.example.module04_module19_module6.ClassAAJ,
		param2: com.android.example.module04_module19_module6.ClassAAH,
		param3: com.android.example.module04_module19_module6.ClassAAB
	) {
	}
}
