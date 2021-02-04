package com.android.example.module01_module04

@Suppress("UNUSED_PARAMETER")
class ClassAAF {
	private 	val instance_var_1_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
	}

	fun method1(
		param0: io.reactivex.internal.disposables.ListCompositeDisposable
	) {
		for (iAb in 0..1) {
			listOf("1", "2", "3").forEach {
				for (iAc in 0..3) {
					val local_var_5_0: com.android.example.module06_module281_module1.ClassAAE = com.android.example.module06_module281_module1.ClassAAE()
					local_var_5_0.method2(com.android.example.module06_module342_module3.ClassAAA(), com.android.example.module06_module282_module1.ClassAAD(), com.android.example.module06_module282_module1.ClassAAD())

					val local_var_5_1: com.android.example.module06_module282_module1.ClassAAJ = com.android.example.module06_module282_module1.ClassAAJ()
					local_var_5_1.method0(com.android.example.module06_module342_module3.ClassAAG())

				}
				val local_var_4_0: com.android.example.module06_module337_module3.ClassAAJ = com.android.example.module06_module337_module3.ClassAAJ()
				local_var_4_0.method1(io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

			}
			val local_var_3_0: com.android.example.module06_module044_module2.ClassAAA = com.android.example.module06_module044_module2.ClassAAA()
			local_var_3_0.method0(com.android.example.module06_module340_module3.ClassAAA(), com.android.example.module06_module340_module3.ClassAAD())

		}
		val local_var_2_1: com.android.example.module06_module337_module3.ClassAAF = com.android.example.module06_module337_module3.ClassAAF()
		local_var_2_1.method3(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
	}

	fun method3(
		param0: io.reactivex.schedulers.TestScheduler,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.disposables.SerialDisposable,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_4: com.android.example.module06_module201_module1.ClassAAG = com.android.example.module06_module201_module1.ClassAAG()
		local_var_2_4.method1(io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.observers.TestObserver())

	}

	fun method4(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.internal.disposables.ListCompositeDisposable,
		param2: io.reactivex.internal.disposables.ListCompositeDisposable,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.cancel()

		val local_var_2_4: com.android.example.module06_module282_module1.ClassAAH = com.android.example.module06_module282_module1.ClassAAH()
		local_var_2_4.method0(com.android.example.module06_module342_module3.ClassAAI(), com.android.example.module06_module342_module3.ClassAAB(), com.android.example.module06_module342_module3.ClassAAH())

		val local_var_2_5: com.android.example.module06_module044_module2.ClassAAC = com.android.example.module06_module044_module2.ClassAAC()
		local_var_2_5.method0(com.android.example.module06_module340_module3.ClassAAI())

		val local_var_2_6: com.android.example.module06_module282_module1.ClassAAA = com.android.example.module06_module282_module1.ClassAAA()
		local_var_2_6.method4(com.android.example.module06_module342_module3.ClassAAG(), com.android.example.module06_module342_module3.ClassAAB(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.schedulers.IoScheduler())

	}
}
